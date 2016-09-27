package com.alexpoltavets.absolutewstask.model.rest;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "recent")
public class Recent
{
    @ElementList(inline = true)
    private List<Item> item;

    public List<Item> getItem ()
    {
        return item;
    }

    public void setItem (List<Item> item)
    {
        this.item = item;
    }


}