package com.example.layoutempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        checkBox = (CheckBox) findViewById(R.id.chkGenero);
    }

    public void btnSeleccionar(View v){
        if (checkBox.isChecked() == true){
            String mensaje = "Seleccionado";
            Toast toast = Toast.makeText(this,"Seleccionado!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL  | Gravity.START, 90,0 );
            toast.show();
        } else{
            String mensaje = "No seleccionado";
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        }
    }
}