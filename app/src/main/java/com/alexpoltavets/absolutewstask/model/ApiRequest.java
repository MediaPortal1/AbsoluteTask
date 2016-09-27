package com.alexpoltavets.absolutewstask.model;

import android.util.Log;

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
        Call<com.alexpoltavets.absolutewstask.model.rest.Response> call=service.getBuildings();
        call.enqueue(new Callback<com.alexpoltavets.absolutewstask.model.rest.Response>() {
            @Override
            public void onResponse(Call<com.alexpoltavets.absolutewstask.model.rest.Response> call, Response<com.alexpoltavets.absolutewstask.model.rest.Response> response) {
                Log.d("RETROFIT","Success");
            }

            @Override
            public void onFailure(Call<com.alexpoltavets.absolutewstask.model.rest.Response> call, Throwable t) {
                Log.d("FAILED",t.getLocalizedMessage());
            }
        });
    }
}
