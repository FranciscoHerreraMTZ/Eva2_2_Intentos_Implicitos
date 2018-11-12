package com.example.spart.eva2_2_intentos_implicitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button sboton;
Intent inLanzamiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sboton = findViewById(R.id.botpn);
        inLanzamiento = new Intent(this,Secundaria.class);
        sboton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(inLanzamiento);

    }
}
