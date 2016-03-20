package com.example.android.animaissos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    public void mapa (View view){
        setContentView(R.layout.imagem);
    }

    public void carac (View view){
        setContentView(R.layout.activity_main);
    }

    public void inicio (View view){
        setContentView(R.layout.inicio);
    }

}
