package com.example.show_me;

import com.example.show_me.interfaces.IServices;
import com.example.show_me.network.ServicesManager;

import retrofit2.Retrofit;

public class Mars {
    IServices iServices = ServicesManager.retrofit.create(IServices.class);
}
