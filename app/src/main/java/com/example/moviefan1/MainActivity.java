package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button catalogobut=findViewById(R.id.botonCatalogo);
        Button listabut=findViewById(R.id.botonListas);
        Button destacadobut=findViewById(R.id.botonDestacados);
        ImageButton peli1=findViewById(R.id.pelicula1);
        ImageButton peli2=findViewById(R.id.pelicula2);
        ImageButton peli3=findViewById(R.id.pelicula3);
        ImageButton peli4=findViewById(R.id.pelicula4);
        ImageButton peli5=findViewById(R.id.pelicula5);
        ImageButton peli6=findViewById(R.id.pelicula6);

        peli1.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, vistaPeliculas.class);
            startActivity(i);
        });

        peli2.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, vistaPeliculas.class);
            startActivity(i);
        });

        peli3.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, vistaPeliculas.class);
            startActivity(i);
        });

        peli4.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, vistaPeliculas.class);
            startActivity(i);
        });

        peli5.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, vistaPeliculas.class);
            startActivity(i);
        });

        peli6.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, vistaPeliculas.class);
            startActivity(i);
        });

        catalogobut.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, catalogo.class);
            startActivity(i);
        });

        listabut.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, listas.class);
            startActivity(i);
        });

        destacadobut.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this, loggin.class);
            startActivity(i);
        });
    }
    SearchView search_view;

}