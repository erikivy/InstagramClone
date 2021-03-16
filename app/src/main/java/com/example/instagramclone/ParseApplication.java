package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LVo516Wqgsmt6iWsRxlg2VIqlX86E4ffqWJWPeKD")
                .clientKey("j4YtyMqdwIsUVRo0d4qoJhO4eCnciC2gT87uEGmi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
