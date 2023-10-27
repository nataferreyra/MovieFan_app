package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class pantallaPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_perfil);

        Button listap=findViewById(R.id.perfillista);

        listap.setOnClickListener(view -> {
            Intent i=new Intent(pantallaPerfil.this, listas.class);
            startActivity(i);
        });
    }
}