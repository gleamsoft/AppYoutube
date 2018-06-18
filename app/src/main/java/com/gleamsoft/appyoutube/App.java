package com.gleamsoft.appyoutube;

import com.parse.Parse;
import com.parse.ParseUser;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8kTYyC8k4M1s5fsu8tam5pPWJyLJkdn7euWQTXcr")
                .clientKey("yxMrnawsuNpWGwdBujxsoMkamfaxi6KQpSAtSRtX")
                .server("https://parseapi.back4app.com/")
                .build()

        );
        ParseUser.enableAutomaticUser();
    }
}