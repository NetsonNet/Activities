package com.practicas.moviles.nels.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener{
 Button boton;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        boton = (Button) findViewById(R.id.IdBoton);
        editText =(EditText) findViewById(R.id.editText);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.IdBoton:
                Intent intent = new Intent(this,Segunda.class);

                //para enviar dato
                String dato = editText.getText().toString();
                intent.putExtra("DATO",dato);//PutExtra es para mandar el dato a otra activity
                startActivity(intent);

               break;
        }
    }
}
