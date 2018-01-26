package com.omar.memycar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.omar.memycar.R;

/**
 * Created by Omar on 1/24/2018.
 */

public class SecSplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_two_en);
    }}

      /*  new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent i = new Intent(SecSplashActivity.this, MainActivity.class);
                startActivity(i);


                finish();
            }
        }, SPLASH_TIME_OUT);
    }


}

 */