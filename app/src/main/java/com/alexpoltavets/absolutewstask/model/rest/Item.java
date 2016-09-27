package com.alexpoltavets.absolutewstask.model.rest;

import com.google.gson.annotations.SerializedName;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item")
public class Item
{
    @Element(name = "id")
    private String id;

    @Element(name = "title")
    private String title;

    @Element(name = "address")
    private String address;

    @Element(name = "coordinate")
    private Coordinate coordinate;

    @Element(name = "min_sale")
    private String min_sale;

    @Element(name = "image")
    private String image;

    @Element(name = "rent")
    private String rent;

    @Element(name = "min_rent")
    private String min_rent;

    @Element(name = "sale")
    private String sale;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public Coordinate getCoordinate ()
    {
        return coordinate;
    }

    public void setCoordinate (Coordinate coordinate)
    {
        this.coordinate = coordinate;
    }

    public String getMin_sale ()
    {
        return min_sale;
    }

    public void setMin_sale (String min_sale)
    {
        this.min_sale = min_sale;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getRent ()
    {
        return rent;
    }

    public void setRent (String rent)
    {
        this.rent = rent;
    }

    public String getMin_rent ()
    {
        return min_rent;
    }

    public void setMin_rent (String min_rent)
    {
        this.min_rent = min_rent;
    }

    public String getSale ()
    {
        return sale;
    }

    public void setSale (String sale)
    {
        this.sale = sale;
    }

}