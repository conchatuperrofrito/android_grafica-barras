package com.example.graficodebarras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);

    }
    public  void graficar(View V){
        Intent i=new Intent(this,ventanaGrafica.class);
        i.putExtra("valor1",et1.getText().toString());
        i.putExtra("valor2",et2.getText().toString());
        i.putExtra("valor3",et3.getText().toString());
        startActivity(i);
    }
}