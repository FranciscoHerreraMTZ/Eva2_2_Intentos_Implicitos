package com.example.spart.eva2_2_intentos_implicitos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secundaria extends AppCompatActivity implements View.OnClickListener  {
Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        boton =findViewById(R.id.botno2);
        boton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        finish();
    }
}
