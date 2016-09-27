package com.alexpoltavets.absolutewstask.loaders;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.alexpoltavets.absolutewstask.model.ApiRequest;
import com.alexpoltavets.absolutewstask.model.entities.Building;
import com.alexpoltavets.absolutewstask.model.entities.BuildingList;
import com.alexpoltavets.absolutewstask.other.MainBuildingsAdapter;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;


public class BuildingsListLoader extends AsyncTask<Void,Void,List<Building>> {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private Context context;

    public BuildingsListLoader(RecyclerView recyclerView, ProgressBar progressBar, Context context) {
        this.recyclerView = recyclerView;
        this.progressBar = progressBar;
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.INVISIBLE);

    }

    @Override
    protected List<Building> doInBackground(Void... params) {
        Response<BuildingList> responce=null;
        List<Building> itemlist=null;
        try {
            responce=ApiRequest.getInstance().getBuildingsList();
            itemlist=responce.body().getData().getBuildings();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemlist;
    }

    @Override
    protected void onPostExecute(List<Building> buildings) {
        super.onPostExecute(buildings);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        MainBuildingsAdapter adapter=new MainBuildingsAdapter(buildings);
        recyclerView.setAdapter(adapter);
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView.setVisibility(View.VISIBLE);
    }
}