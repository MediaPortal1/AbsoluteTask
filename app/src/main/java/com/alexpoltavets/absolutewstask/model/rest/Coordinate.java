package com.alexpoltavets.absolutewstask.model.rest;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "coordinate")
public class Coordinate
{
    @Element(name = "lng")
    private String lng;

    @Element(name = "lat")
    private String lat;

    public String getLng ()
    {
        return lng;
    }

    public void setLng (String lng)
    {
        this.lng = lng;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

}
