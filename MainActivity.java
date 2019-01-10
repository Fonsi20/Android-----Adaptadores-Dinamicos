package com.example.a16alfonsofa.frutas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText EDtexto;
    private Button btnSalir, btnCargar, btnSegunda;
    private ArrayList<String> arrayFrutas = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCargar = (Button) findViewById(R.id.BTNCargar);
        btnSalir = (Button) findViewById(R.id.BTNSalir);
        btnSegunda = (Button) findViewById(R.id.BTNSegunda);
        EDtexto = (EditText) findViewById(R.id.EDTexto);

        btnCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = EDtexto.getText().toString();
                arrayFrutas.add(text);
                EDtexto.setText("");
            }
        });

        btnSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("cadena", arrayFrutas);
                Log.i("Ciclo-Vida", "Se ejecuta el metodo onClick NOS VAMOS A LA DOS!");
                startActivity(i);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
