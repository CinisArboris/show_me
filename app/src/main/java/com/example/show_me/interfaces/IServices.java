package com.example.show_me.interfaces;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IServices {
    @GET("photos")
    Call<String> getPhotos();
}
