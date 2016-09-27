package com.alexpoltavets.absolutewstask.model;

import android.os.NetworkOnMainThreadException;
import android.util.Log;

import com.alexpoltavets.absolutewstask.model.entities.BuildingList;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ApiRequest {
    private static ApiRequest instance=null;
    private BuildingsInterface service;

    private ApiRequest(BuildingsInterface service) {
        this.service= service;

    }
    private ApiRequest(){}
    public static ApiRequest getInstance(){
        if(instance==null){
            instance=new ApiRequest(RestClient.getInstance().create(BuildingsInterface.class));
        }
        return instance;
    }
    public Response<BuildingList> getBuildingsList() throws NetworkOnMainThreadException, IOException {
        Call<BuildingList> call=service.getBuildings();
       return call.execute();
    }
    public Response<BuildingList> getBuildingItem(int id) throws NetworkOnMainThreadException,IOException{
        Call<BuildingList> call=service.getBuildingItem(id);
        return call.execute();
    }
}
