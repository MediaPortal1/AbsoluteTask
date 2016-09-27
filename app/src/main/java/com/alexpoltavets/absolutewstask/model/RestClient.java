package com.alexpoltavets.absolutewstask.model;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;


public class RestClient {

    public static final String API_BASE_URL="http://sunnyislere.aws4apps.com/v1/building/";

    private static Retrofit retrofit=null;

    public static Retrofit getInstance(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
