package com.example.formulariodecontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, nacimiento, telefono, email, descripcion;
    Button  aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombre = (EditText)findViewById(R.id.editNombre);
        nacimiento  = (EditText)findViewById(R.id.editNacimiento);
        telefono =  (EditText)findViewById(R.id.editTelefono);
        email = (EditText)findViewById(R.id.editEmail);
        descripcion = (EditText)findViewById(R.id.editDescripcion);
        aceptar = (Button)findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String naci = nacimiento.getText().toString();
                String tele = telefono.getText().toString();
                String mail = email.getText().toString();
                String descri = descripcion.getText().toString();



            Intent i= new Intent(MainActivity .this, DatosMostrar .class);

                i.putExtra("name",name);
                i.putExtra("naci",naci);
                i.putExtra("tele",tele);
                i.putExtra("mail",mail);
                i.putExtra("descri",descri);

            startActivity(i);
        }


        });
    }
}