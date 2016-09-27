package com.alexpoltavets.absolutewstask.model.rest;

import com.google.gson.annotations.SerializedName;


public class BuildingList {

    @SerializedName("data")
    private Data data;
    @SerializedName("status")
    private String status;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}