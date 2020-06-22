package br.unicamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityConversor extends AppCompatActivity {

    TextView tvResultadoFaren;
    TextView tvResultadoKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        Intent intent = getIntent();//pego o intent do MainActivity
        Bundle params = intent.getExtras();
        Double celsius = params.getDouble("Resultado");

        tvResultadoFaren = (TextView)findViewById(R.id.tvResultadoFaren);
        tvResultadoKelvin= (TextView)findViewById(R.id.tvResultadoKelvin);

        //seto o celsius no tv's
        tvResultadoKelvin.setText(celsius.toString());
        tvResultadoFaren.setText(celsius.toString());

        //Formula para conversão de Kelvin
        Double varKelvin = celsius + 273.15;
        tvResultadoKelvin.setText(varKelvin.toString());

        //Formula para conversão de Farehnheit
        Double varFaren  = (celsius * 1.8) + 32;
        tvResultadoFaren.setText(varFaren.toString());

    }
}
