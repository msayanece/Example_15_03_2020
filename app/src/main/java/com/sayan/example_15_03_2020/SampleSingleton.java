package com.sayan.example_15_03_2020;

public class SampleSingleton {

    private static SampleSingleton instance;

    private SampleSingleton() {
    }

    public static SampleSingleton getInstance(){
        if (instance == null)
            instance = new SampleSingleton();
        return instance;
    }
}
