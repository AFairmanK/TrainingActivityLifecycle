package com.example.adam.trainingactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("In onCreate()");
    }
    @Override
    protected void onPause(){
        super.onPause(); //We call the super when override
        System.out.println("In onPause()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("In onStart()"); //overridden methods and system out prints to see where we are at

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("In onRestart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("In onResume()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("In onDestroy()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("In onStop()");
    }
}
