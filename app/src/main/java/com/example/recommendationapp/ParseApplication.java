package com.example.recommendationapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("s7YGQpMI5e7VdJLwrTcBmtTnmLuS0WJQNWkh5ENV")
                .clientKey("Pkj8rl7GmkbZ95wMB6dIuCJPvzu3c3C9ebubAZjv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
