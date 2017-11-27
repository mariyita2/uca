package com.delaroystudios.alarmreminder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main_Configuracion_klm extends AppCompatActivity {
    EditText dist;
    EditText com;
    Button Acep;
    Button Can;
    View view;
    String Comp = "First toast";
    float pasar = 0;
    float total_consumo = 0;
    String intent = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__configuracion_klm);
        dist = (EditText) findViewById(R.id.kilometros);
        com = (EditText) findViewById(R.id.Combustible);
        Acep = (Button) findViewById(R.id.Aceptar);
        Can = (Button) findViewById(R.id.cancelar);

        final Context context = this;
        SharedPreferences sp = getSharedPreferences("Consumo", context.MODE_PRIVATE);


        Can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main_Configuracion_klm.this, Main_Combustible.class);
                startActivity(i);
            }
        });

        Acep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                float dista = Float.parseFloat(dist.getText().toString());

                float comb = Float.parseFloat(com.getText().toString());

                SharedPreferences sp = getPreferences(context.MODE_PRIVATE);



                if (dista<0.1 || comb<0.1)
                {
                    Toast.makeText(getApplicationContext(), "Error, verifique los datos antes guardar", Toast.LENGTH_LONG).show();
                }
                else {

                    total_consumo = comb / dista;

                    SharedPreferences.Editor editor = sp.edit();
                    editor.putFloat("Consumir", total_consumo);
                    editor.commit();

                    pasar = total_consumo;
                    intent=String.valueOf(pasar);
                    Intent i = new Intent(Main_Configuracion_klm.this, Main_Combustible.class);
                    startActivity(i);
                }


            }
        });

    }
}


