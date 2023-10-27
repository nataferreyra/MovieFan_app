package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.view.View;
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
        ImageButton botonPer=findViewById(R.id.botonPerfil);
        ImageButton peli1=findViewById(R.id.pelicula1);
        ImageButton peli2=findViewById(R.id.pelicula2);
        ImageButton peli3=findViewById(R.id.pelicula3);
        ImageButton peli4=findViewById(R.id.pelicula4);
        ImageButton peli5=findViewById(R.id.pelicula5);
        ImageButton peli6=findViewById(R.id.pelicula6);
        ImageButton netfli=findViewById(R.id.plataforma1);
        ImageButton hbomx=findViewById(R.id.plataforma2);
        ImageButton star=findViewById(R.id.plataforma3);
        ImageButton prime=findViewById(R.id.plataforma4);
        ImageButton param=findViewById(R.id.plataforma5);
        ImageButton disney=findViewById(R.id.plataforma6);
        

        botonPer.setOnClickListener(view ->{
            Intent i=new Intent(MainActivity.this,pantallaPerfil.class);
            startActivity(i);

        });

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

        SearchView searchView = findViewById(R.id.busquedabarra);
        searchView.setQuery("NO DESARROLADO POR EL MOMENTO NO USAR", false);

        popUpCreador DialogHelper = null;
        DialogHelper.mostrarPopUp(this, netfli, "La plataforma netflix tiene" +
                " un precio de ",10, R.drawable.netflix);

        DialogHelper.mostrarPopUp(this, hbomx, "La plataforma Hbo Max tiene" +
                " un precio de ",5, R.drawable.hbomax);

        DialogHelper.mostrarPopUp(this, star, "La plataforma star tiene" +
                " un precio de ",8, R.drawable.starplus);

        DialogHelper.mostrarPopUp(this, prime, "La plataforma prime video tiene" +
                " un precio de ",9, R.drawable.primevideo2);

        DialogHelper.mostrarPopUp(this, param, "La plataforma paramoun tiene" +
                " un precio de ",4, R.drawable.paramount);

        DialogHelper.mostrarPopUp(this, disney, "La plataforma disney tiene" +
                " un precio de",6, R.drawable.disney);






    }

}