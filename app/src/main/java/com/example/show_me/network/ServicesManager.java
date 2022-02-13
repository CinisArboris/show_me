package com.example.show_me.network;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ServicesManager {
    public static String BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com";
    public static Retrofit retrofit = new Retrofit
            .Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl(BASE_URL)
            .build();
}

