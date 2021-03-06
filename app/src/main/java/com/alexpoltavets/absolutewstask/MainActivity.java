package com.alexpoltavets.absolutewstask;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.alexpoltavets.absolutewstask.loaders.BuildingsListLoader;
import com.alexpoltavets.absolutewstask.model.FacebookUser;
import com.alexpoltavets.absolutewstask.model.ApiRequest;
import com.alexpoltavets.absolutewstask.model.entities.Building;

import java.util.List;


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
        BuildingsListLoader listLoader=new BuildingsListLoader((RecyclerView) findViewById(R.id.main_recycler),(ProgressBar)findViewById(R.id.main_progressbar),getBaseContext());
        listLoader.execute();
    }

}
