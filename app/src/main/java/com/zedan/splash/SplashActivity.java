package com.zedan.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean  userLogin = false;
        if (userLogin){
            startActivity(new Intent(this, MainActivity.class));
        }else {
            startActivity(new Intent(this, Main2Activity.class));
        }
    }
}
