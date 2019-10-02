package com.example.mybotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*1ER EJEMPLO */


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblMensaje = (TextView)findViewById(R.id.LblMensaje);


    }


    public void botonTocado (View v)
    {
    lblMensaje.setText(v.getClass().getCanonicalName());

    }



}
