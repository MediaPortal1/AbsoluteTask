package com.alexpoltavets.absolutewstask.model;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by Alex Poltavets on 26.09.2016.
 */

public class ApiClient {

    public static final String API_BASE_URL="http://sunnyislere.aws4apps.com/v1/building/";

    private static Retrofit retrofit=null;

    public Retrofit getInstance(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .client(new OkHttpClient())
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
