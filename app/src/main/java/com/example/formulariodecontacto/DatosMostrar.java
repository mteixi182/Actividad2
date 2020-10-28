package com.example.formulariodecontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatosMostrar extends AppCompatActivity {

    TextView tvNombres, tVNacimiento, tVTelefono, tVMail, tVDescripcion;
    Button btnEditardatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_mostrar);

        tvNombres = (TextView)findViewById(R.id.tVNombres);
        tVNacimiento = (TextView)findViewById(R.id.tVNacimiento);
        tVTelefono = (TextView)findViewById(R.id.tVTelefono);
        tVMail = (TextView)findViewById(R.id.tVMail);
        tVDescripcion = (TextView)findViewById(R.id.tVDescripcion);
        btnEditardatos = (Button)findViewById(R.id.btnEditardatos);

        btnEditardatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DatosMostrar.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mostrarDatos();



    }
    private void mostrarDatos() {

        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString( "name");
        String nacimiento = datos.getString("naci");
        String telefono = datos.getString("tele");
        String mail = datos.getString("mail");
        String descripcion = datos.getString("descri");

        tvNombres.setText(nombre);
        tVNacimiento.setText(nacimiento);
        tVTelefono.setText(telefono);
        tVMail.setText(mail);
        tVDescripcion.setText(descripcion);
    }
}