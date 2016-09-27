package com.alexpoltavets.absolutewstask.other;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexpoltavets.absolutewstask.R;
import com.alexpoltavets.absolutewstask.loaders.ImageHandler;
import com.alexpoltavets.absolutewstask.model.entities.Building;


public class MainBuildingsHolder extends RecyclerView.ViewHolder {

    private Building buildingitem;

    private View rootView;

    private TextView title;
    private ImageView image;
    private TextView address;
    private TextView rent;
    private TextView sale;
    private TextView minRent;
    private TextView minSale;

    public MainBuildingsHolder(View itemView) {
        super(itemView);
        this.rootView=itemView;
        title=(TextView) itemView.findViewById(R.id.item_title);
        address=(TextView) itemView.findViewById(R.id.item_address);
        rent=(TextView) itemView.findViewById(R.id.item_rent);
        sale=(TextView) itemView.findViewById(R.id.item_sale);
        minRent=(TextView) itemView.findViewById(R.id.item_minrent);
        minSale=(TextView) itemView.findViewById(R.id.item_minsale);
        image=(ImageView)itemView.findViewById(R.id.item_imageview);
    }
    public void onBindData(Building building){
        Resources resources=rootView.getContext().getResources();
        this.buildingitem=building;
        title.setText(resources.getString(R.string.title,building.getTitle()));
        address.setText(resources.getString(R.string.address,building.getAddress()));
        minRent.setText(resources.getString(R.string.minrent,building.getMinRent()));
        minSale.setText(resources.getString(R.string.minsale,building.getMinSale()));
        sale.setText(resources.getString(R.string.sale,building.getSale()));
        rent.setText(resources.getString(R.string.rent,building.getRent()));
        ImageHandler.getSharedInstance(rootView.getContext()).load(ImageHandler.IMG_URL+building.getImage()).resize(400,400).into(image);
    }
}
