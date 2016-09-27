package com.alexpoltavets.absolutewstask.other;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alexpoltavets.absolutewstask.R;
import com.alexpoltavets.absolutewstask.model.entities.Building;

import java.util.List;

/**
 * Created by Alex Poltavets on 27.09.2016.
 */

public class MainBuildingsAdapter extends RecyclerView.Adapter<MainBuildingsHolder> {

    private List<Building> itemlist;

    public MainBuildingsAdapter(List<Building> itemlist) {
        this.itemlist = itemlist;
    }

    @Override
    public MainBuildingsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainBuildingsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_building,parent,false));
    }

    @Override
    public void onBindViewHolder(MainBuildingsHolder holder, int position) {
        holder.onBindData(itemlist.get(position));
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }
}
