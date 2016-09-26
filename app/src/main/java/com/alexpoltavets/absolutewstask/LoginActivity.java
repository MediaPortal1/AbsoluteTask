package com.alexpoltavets.absolutewstask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alexpoltavets.absolutewstask.model.FacebookUser;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

/**
 * Created by Alex Poltavets on 26.09.2016.
 */

public class LoginActivity extends AppCompatActivity {

    public static final String FACEBOOK_USER_KEY="facebook.user";

    private CallbackManager callbackManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFacebookSDK();
        setContentView(R.layout.activity_login);
        initFacebookOauth();
    }

    private void initFacebookSDK(){
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(getApplication());
    }
    private void initFacebookOauth(){

        callbackManager = CallbackManager.Factory.create();
        final LoginButton loginButton= (LoginButton) findViewById(R.id.login_facebook_btn);
        loginButton.setReadPermissions(Arrays.asList("public_profile","email"));
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                GraphRequest request=GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        try {
                            startMainActivity(new FacebookUser(object.getString("name"),object.getString("email")));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });

                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,name,email,gender,birthday");
                request.setParameters(parameters);
                request.executeAsync();

            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(getBaseContext(),getString(R.string.login_error),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode,resultCode,data);
    }
    private void startMainActivity(FacebookUser user){
        Intent intent=new Intent(getBaseContext(),MainActivity.class);
        intent.putExtra(FACEBOOK_USER_KEY,user);
        startActivity(intent);
    }
}
