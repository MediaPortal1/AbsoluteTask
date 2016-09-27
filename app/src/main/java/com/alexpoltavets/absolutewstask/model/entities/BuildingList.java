package com.alexpoltavets.absolutewstask.model.entities;

import com.google.gson.annotations.SerializedName;


public class BuildingList {

    @SerializedName("data")
    private ListData data;
    @SerializedName("status")
    private String status;


    public ListData getData() {
        return data;
    }

    public void setData(ListData data) {
        this.data = data;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}