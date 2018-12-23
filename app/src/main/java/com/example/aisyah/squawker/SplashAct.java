package com.example.aisyah.squawker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashAct extends Activity {
    //durasi splash
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                //pengalamatan halaman sesudah splash
                    Intent mainIntent = new Intent(SplashAct.this,Login.class);
                    SplashAct.this.startActivity(mainIntent);
                    SplashAct.this.finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
        }
    }

