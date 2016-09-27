package com.alexpoltavets.absolutewstask.model;

import android.util.Log;

import com.alexpoltavets.absolutewstask.model.rest.BuildingList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ApiRequest {
    private static ApiRequest instance=null;

    private ApiRequest() {
    }
    public static ApiRequest getInstance(){
        if(instance==null){
            instance=new ApiRequest();
        }
        return instance;
    }
    public void getBuildingsList(){
        ApiCallback service= RestClient.getInstance().create(ApiCallback.class);
        Call<BuildingList> call=service.getBuildings();
       call.enqueue(new Callback<BuildingList>() {
           @Override
           public void onResponse(Call<BuildingList> call, Response<BuildingList> response) {
               Log.d("RETROFIT","SUCCESS");
           }

           @Override
           public void onFailure(Call<BuildingList> call, Throwable t) {
               Log.d("RETROFIT","FAILED: "+t.getLocalizedMessage());
           }
       });
    }
}
