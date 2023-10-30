package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Idioma.cambiar();

        TextView bienvenida=findViewById(R.id.textoBienvenida);
        TextView catalo=findViewById(R.id.botonCatalogo);
        TextView dest=findViewById(R.id.botonDestacados);
        TextView list=findViewById(R.id.botonListas);
        TextView platf=findViewById(R.id.textoPlataformas);
        TextView estr=findViewById(R.id.textoEstrenos);
        String estre="Estrenos mas esperados!";
        String estreEng="Most anticipated premieres!";
        String plat="Plataformas";
        String platEng="Streaming Platforms";
        String lists="Listas";
        String listEng="Lists";
        String des="Cambiar a Inglés";
        String desEng="Change to Spanish";
        String cat="Catalogo";
        String catEng="Catalogue";
        String msj="Bienvenidos a nuestra comunidad MovieFan, donde te proporcionamos información sobre las peliculas que mas te interesan o que estas buscando, con la oportunidad de que puedas compartir tu opinion con nuestros criticers y a la vez ver una amplia cartelera la cual nos motivara a descubrir nuevas aventuras. Sumate a esta entretenida comunidad!!";
        String msjEng="Welcome to our MovieFan community, where we provide you with information about the movies that interest you most or that you are looking for, with the opportunity for you to share your opinion with our critics and at the same time see a wide billboard which will motivate us to discover new adventures . . Join this entertaining community!!";
        bienvenida.setText(msj);
        catalo.setText(cat);
        dest.setText(des);
        list.setText(lists);
        platf.setText(plat);
        estr.setText(estre);


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
            if (Idioma.getIdioma()){
                bienvenida.setText(msj);
                catalo.setText(cat);
                dest.setText(des);
                list.setText(lists);
                platf.setText(plat);
                estr.setText(estre);
                Idioma.cambiar();
            }else{
                bienvenida.setText(msjEng);
                catalo.setText(catEng);
                dest.setText(desEng);
                list.setText(listEng);
                platf.setText(platEng);
                estr.setText(estreEng);
                Idioma.cambiar();
            }
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

