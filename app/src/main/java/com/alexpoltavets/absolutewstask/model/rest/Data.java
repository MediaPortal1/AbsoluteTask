package com.alexpoltavets.absolutewstask.model.rest;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "data")
public class Data
{
    @Element(name = "buildings")
    private Buildings buildings;

    @Element(name = "recent")
    private Recent recent;

    public Buildings getBuildings ()
    {
        return buildings;
    }

    public void setBuildings (Buildings buildings)
    {
        this.buildings = buildings;
    }

    public Recent getRecent ()
    {
        return recent;
    }

    public void setRecent (Recent recent)
    {
        this.recent = recent;
    }

}

