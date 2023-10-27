package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class listas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);


        ImageButton venom=findViewById(R.id.peli1);

        venom.setOnClickListener(view -> {
            Intent i=new Intent(listas.this, vistaPelicula2.class);
            startActivity(i);
        });

    }
}