package com.example.a16alfonsofa.frutas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private Spinner SP;
    private Button btnRegresar;
    private ArrayList<String> arrayFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        arrayFrutas = i.getExtras().getStringArrayList("cadena");

        SP = (Spinner) findViewById(R.id.Spinner);
        btnRegresar = (Button) findViewById(R.id.BTNRegresar);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arrayFrutas);
        SP.setAdapter(adaptador);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Log.i("Ciclo-Vida", "Se ejecuta el metodo onClick NOS VAMOS A LA UNO!");
            }
        });

    }
}
