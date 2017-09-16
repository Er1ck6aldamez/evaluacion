package com.example.pc_38.evaluacionuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNuevoEst, btnListaEst;
    public static ArrayAdapter<Estudiantes> lista = ArrayAdapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnNuevoEst = (Button) findViewById(R.id.btnNuevoEst);
        btnListaEst = (Button) findViewById(R.id.btnListaEstudiante);


        btnNuevoEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DatosEstudiantes.class);
                startActivityForResult(intent, 1);
            }
        });

        btnListaEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null && resultCode == 1){
            
        }
    }
}
