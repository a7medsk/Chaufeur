package com.example.a7med.chaufeur;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by a7med on 30/10/2017.
 */

public class ChauffeurApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);


    }

}
