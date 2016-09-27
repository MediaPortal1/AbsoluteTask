package com.alexpoltavets.absolutewstask.loaders;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;

import com.alexpoltavets.absolutewstask.R;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

import java.util.concurrent.Executors;

public class ImageHandler {

    public static final String IMG_URL="http://sunnyislere.aws4apps.com/";

    private static Picasso instance;

    public static Picasso getSharedInstance(Context context)
    {
        if(instance == null)
        {
            instance = new Picasso.Builder(context).executor(Executors.newSingleThreadExecutor()).memoryCache(Cache.NONE).indicatorsEnabled(true).build();
            return instance;
        }
        else
        {
            return instance;
        }
    }
}
