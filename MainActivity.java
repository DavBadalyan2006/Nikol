package com.samsung.imagedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProfileView profileView = new ProfileView(getApplicationContext());
        setContentView(profileView);
    }
}