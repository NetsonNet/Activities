package com.practicas.moviles.nels.activities;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Segunda extends AppCompatActivity {
    //declarar para recibir el mensaje
     TextView textView;

    // declarar para los readio button
     RadioGroup radiobuttongroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //para recibir el texto
        textView = (TextView) findViewById(R.id.Idtextview);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null)
        {
           String cadena = (String) bundle.get("DATO");
            textView.setText(cadena);
        }
        // para los radio button
        radiobuttongroup= (RadioGroup) findViewById(R.id.radioGroup);
        radiobuttongroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if( checkedId == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"Hola!",Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"Cómo",Toast.LENGTH_SHORT).show();
                }else  if(checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"estás?",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
