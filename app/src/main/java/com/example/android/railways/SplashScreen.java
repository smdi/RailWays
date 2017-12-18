package com.example.android.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
         getSupportActionBar().hide();
         Thread mt = new Thread()
        {
           public void run() {
               try {

                   sleep(3000);
                   Intent i1 = new Intent(getApplicationContext(),MainActivity.class);
                   startActivity(i1);
                   finish();
               }
               catch (Exception e)
               {
                   e.printStackTrace();
               }
           }

        };

         mt.start();
    }
}
