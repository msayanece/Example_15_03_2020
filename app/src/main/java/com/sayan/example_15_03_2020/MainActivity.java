package com.sayan.example_15_03_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SampleSingleton.getInstance();
        SampleSingleton.getInstance();
        SampleSingleton.getInstance();
        SampleSingleton.getInstance();
        SampleSingleton.getInstance();
        SampleSingleton.getInstance();
        SampleSingleton.getInstance();
    }
}
