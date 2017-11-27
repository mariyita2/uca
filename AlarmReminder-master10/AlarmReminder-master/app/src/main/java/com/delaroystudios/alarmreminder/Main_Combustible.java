package com.delaroystudios.alarmreminder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Combustible extends AppCompatActivity {
    EditText distancia;
    TextView acum;
    float acumulador = 0;
    Button conf;
    Button ace;
    TextView ag;
    float total_gas = 0;
    float acum_gas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__combustible);
        acum = (TextView) findViewById(R.id.acumuladorkm);
        distancia = (EditText) findViewById(R.id.EtxtKm);
        conf = (Button) findViewById(R.id.config);
        ace = (Button) findViewById(R.id.Aceptado);
        ag = (TextView) findViewById(R.id.Consum_gas);

        final Context context = this;
        SharedPreferences sp = getSharedPreferences("MiConsumo", context.MODE_PRIVATE);


        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conf = new Intent(Main_Combustible.this, Main_Configuracion_klm.class);
                startActivity(conf);
            }
        });
        ace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float dist_rec = Float.parseFloat(distancia.getText().toString());

                    SharedPreferences sp = getPreferences(context.MODE_PRIVATE);

                    // acum_gas = edt2 / edt1;
                    //if (acum_gas > 0) {
                    if (dist_rec >0) {
                        acumulador = sp.getFloat("MiConsumo", 0);

                        total_gas = total_gas + (acum_gas * dist_rec);
                        acumulador += dist_rec;

                        SharedPreferences.Editor editor = sp.edit();
                        editor.putFloat("MiConsumo", acumulador);
                        //editor.putFloat("MiConsumoGas", total_gas);
                        editor.commit();

                        total_gas = sp.getFloat("MiConsumoGas", 0);
                        editor.putFloat("MiConsumoGas", total_gas);
                        editor.commit();


                        String mostrar_con_gas = Float.toString(total_gas);
                        ag.setText(mostrar_con_gas);


                        String mostrar = Float.toString(acumulador);
                        acum.setText(mostrar);
                    } else {
                        Toast.makeText(getApplicationContext(), "Error, verifique los datos antes de guardar", Toast.LENGTH_LONG).show();


                    }



            }
            // else
            //{
            ///Toast.makeText(getApplicationContext(), "Primero debe ir a configuracion para registrar Km x Lt", Toast.LENGTH_LONG).show();
            // }


            //}
        });

    }
}




