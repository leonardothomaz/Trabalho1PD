package com.example.trabalho1pd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularCombustivelViavel(View view) {
        EditText precoAlcool = findViewById(R.id.precoAlcool);
        EditText precoGasolina = findViewById(R.id.precoGasolina);

        String pAlcool = precoAlcool.getText().toString();
        String pGasolina = precoGasolina.getText().toString();

        double formatedPAlcool = Double.parseDouble(pAlcool);
        double formatedPGasolina = Double.parseDouble(pGasolina);

        double resultado = formatedPAlcool / formatedPGasolina;

        TextView combustivelViavel = findViewById(R.id.combustivelViavel);

        if (resultado >= 0.70) {
            combustivelViavel.setText("Gasolina");
        } else {
            combustivelViavel.setText("Álcool");
        }
    }

}