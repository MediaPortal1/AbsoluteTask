package com.alexpoltavets.absolutewstask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.widget.TextView;

import com.alexpoltavets.absolutewstask.model.FacebookUser;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUserInfo();
        initList();
    }
    private void initUserInfo(){
        TextView name= (TextView) findViewById(R.id.facebook_name);
        TextView email= (TextView) findViewById(R.id.facebook_email);
        if(getIntent().hasExtra(LoginActivity.FACEBOOK_USER_KEY)){
            FacebookUser user=getIntent().getParcelableExtra(LoginActivity.FACEBOOK_USER_KEY);
            name.setText(getString(R.string.name,user.getFullname()));
            email.setText(getString(R.string.email,user.getEmail()));
        }
    }
    private void initList(){
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.main_recycler);
    }
}
