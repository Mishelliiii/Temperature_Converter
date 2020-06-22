package br.unicamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editCelsius;
    Button   btnConverter;
    TextView tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelsius = (EditText)findViewById(R.id.editCelsius);
        btnConverter= (Button)findViewById(R.id.btnConverter);
        tvMensagem  = (TextView)findViewById(R.id.tvMensagem);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editCelsius.getText().toString().equals(""))
                {
                    tvMensagem.setText("Preencha o campo para a conversão!");

                }else{
                    tvMensagem.setText(""); //Limpo a tela
                    double varTemperatura = Double.parseDouble(editCelsius.getText().toString());

                    Intent intent = new Intent(MainActivity.this,ActivityConversor.class);
                    Bundle params = new Bundle();
                    double celsius = Double.parseDouble(editCelsius.getText().toString());

                    params.putDouble("Resultado", celsius);

                    intent.putExtras(params);
                    startActivity(intent);//Starto a minha Activity
                }


            }
        });


    }




}
