package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class vistaPeliculas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_peliculas);

        Button aniadirPeli = findViewById(R.id.botonAniadirComentario);



    }

//    public void (View v){
//        ImageButton iv1 = findViewById(R.id.botonAniadirLista);
//        PopupMenu pm=new PopupMenu(this,iv1);
//        pm.getMenuInflater().inflate(R.menu.menupopuplistas, pm.getMenu());
//        pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.lista1:
//                        Toast.makeText(vistaPeliculas.this,"Favoritos", Toast.LENGTH_SHORT).show();
//                        return true;
//                    case R.id.lista2:
//                        Toast.makeText(vistaPeliculas.this,"Vistas", Toast.LENGTH_SHORT).show();
//                        return true;
//                    case R.id.lista3:
//                        Toast.makeText(vistaPeliculas.this,"Por ver", Toast.LENGTH_SHORT).show();
//                        return true;
//
//                    case R.id.lista4:
//                        Toast.makeText(vistaPeliculas.this,"Nueva lista", Toast.LENGTH_SHORT).show();
//                        return true;
//                }
//                return false;
//            }
//        });
//        pm.show();
//    }
}