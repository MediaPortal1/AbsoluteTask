package com.alexpoltavets.absolutewstask.model;

import com.alexpoltavets.absolutewstask.model.rest.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCallback {

    @GET("list")
    Call<Response> getBuildings();
    @GET("detail")
    Call<Response> getBuildingItem(@Query("id")int buildingID);
}
