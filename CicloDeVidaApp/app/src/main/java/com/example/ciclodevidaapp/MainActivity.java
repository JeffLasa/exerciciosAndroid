package com.example.ciclodevidaapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MainActivity.class.toString(),"Metodo onCreate");
        Toast.makeText(this,"método onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MainActivity.class.toString(),"Metodo onStar");
        Toast.makeText(this,"método onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MainActivity.class.toString(),"Método onResume");
        Toast.makeText(this,"método onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MainActivity.class.toString(),"Método onPause");
        Toast.makeText(this,"método onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MainActivity.class.toString(),"Método onStop");
        Toast.makeText(this,"método onStop",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MainActivity.class.toString(),"Método onDestry");
        Toast.makeText(this,"método onDestroy",Toast.LENGTH_SHORT).show();
    }
}

