package com.alexpoltavets.absolutewstask.model.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ListData {

    @SerializedName("buildings")
    private List<Building> buildings = new ArrayList<Building>();
    @SerializedName("recent")
    private List<Recent> recent = new ArrayList<Recent>();



    @SerializedName("buildings")
    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Recent> getRecent() {
        return recent;
    }


    public void setRecent(List<Recent> recent) {
        this.recent = recent;
    }

}