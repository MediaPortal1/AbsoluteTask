package com.alexpoltavets.absolutewstask.model;

import com.alexpoltavets.absolutewstask.model.entities.BuildingList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BuildingsInterface {

    @GET("list")
    Call<BuildingList> getBuildings();
    @GET("detail")
    Call<BuildingList> getBuildingItem(@Query("id")int buildingID);
}
