package com.alexpoltavets.absolutewstask.model.rest;


import com.google.gson.annotations.SerializedName;


public class Building {
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("image")
    private String image;
    @SerializedName("address")
    private String address;
    @SerializedName("rent")
    private String rent;
    @SerializedName("sale")
    private String sale;
    @SerializedName("coordinate")
    private Coordinate coordinate;
    @SerializedName("min_rent")
    private String minRent;
    @SerializedName("min_sale")
    private String minSale;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }


    public String getSale() {
        return sale;
    }
    
    public void setSale(String sale) {
        this.sale = sale;
    }

 
    public Coordinate getCoordinate() {
        return coordinate;
    }


    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    
    public String getMinRent() {
        return minRent;
    }


    public void setMinRent(String minRent) {
        this.minRent = minRent;
    }

    public String getMinSale() {
        return minSale;
    }


    public void setMinSale(String minSale) {
        this.minSale = minSale;
    }
    

}
