package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity1(View view) {
        Log.i("info", "ButtonActivity1: Clicked ");
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
        public void launchActivity2 (View view) {
            Log.i("info", "ButtonActivity2: Clicked ");
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

            public void launchActivity3 (View view){
                Log.i("info", "ButtonActivity3: Clicked ");
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
            }
        }

