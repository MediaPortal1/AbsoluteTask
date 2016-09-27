package com.alexpoltavets.absolutewstask.model.rest;

import com.google.gson.annotations.SerializedName;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

public class Recent {

    @SerializedName("id")
    private Integer id;
    @SerializedName("unit_number")
    private String unitNumber;
    @SerializedName("building_title")
    private String buildingTitle;
    @SerializedName("building_id")
    private Integer buildingId;
    @SerializedName("date")
    private String date;
    @SerializedName("date_year")
    private String dateYear;
    @SerializedName("bedroom")
    private Integer bedroom;
    @SerializedName("bath_full")
    private Integer bathFull;
    @SerializedName("living_area")
    private String livingArea;
    @SerializedName("price")
    private String price;
    @SerializedName("percent")
    private String percent;
    @SerializedName("status")
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getBuildingTitle() {
        return buildingTitle;
    }

    public void setBuildingTitle(String buildingTitle) {
        this.buildingTitle = buildingTitle;
    }

    public Integer getBuildingId() {
        return buildingId;
    }


    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateYear() {
        return dateYear;
    }


    public void setDateYear(String dateYear) {
        this.dateYear = dateYear;
    }


    public Integer getBedroom() {
        return bedroom;
    }

    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }


    public Integer getBathFull() {
        return bathFull;
    }


    public void setBathFull(Integer bathFull) {
        this.bathFull = bathFull;
    }

    public String getLivingArea() {
        return livingArea;
    }


    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }


    public String getPercent() {
        return percent;
    }


    public void setPercent(String percent) {
        this.percent = percent;
    }

    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }

}