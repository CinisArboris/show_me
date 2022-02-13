package com.example.show_me;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        loadService();
    }

    private void loadService() {
        Mars mars = new Mars();
        System.out.println(">>>>" + mars.iServices.getPhotos());
    }
}