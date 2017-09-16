package com.example.pc_38.evaluacionuno;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatosEstudiantes extends AppCompatActivity {

    private EditText nombre, codigo, materia, nota1, nota2, nota3;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_estudiantes);

        nombre = (EditText) findViewById(R.id.txtNombre);
        codigo = (EditText) findViewById(R.id.txtCodigo;
        materia = (EditText) findViewById(R.id.txtMateria);
        nota1 = (EditText) findViewById(R.id.txtParcialUno);
        nota2 = (EditText) findViewById(R.id.txtParcialDos);
        nota3 = (EditText) findViewById(R.id.txtParcialFinal);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Estudiantes est = new Estudiantes(
                        nombre.getText().toString(),
                        codigo.getText().toString(),
                        materia.getText().toString(),
                        Double.parseDouble(nota1.getText().toString()),
                        Double.parseDouble(nota2.getText().toString()),
                        Double.parseDouble(nota3.getText().toString())
                );
                Intent intent = new Intent();
                intent.putExtra("est",1);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });




    }
}
