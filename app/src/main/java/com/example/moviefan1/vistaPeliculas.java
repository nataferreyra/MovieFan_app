package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class vistaPeliculas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_peliculas);

        Button aniadirPeli = findViewById(R.id.botonAniadirComentario);
        ImageButton lst=findViewById(R.id.botonAniadirLista);

        lst.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(vistaPeliculas.this);
            View customView = getLayoutInflater().inflate(R.layout.popup_layout, null);
            builder.setView(customView);

            AlertDialog dialog = builder.create();

            Button botonfv = customView.findViewById(R.id.botonfav);
            Button botonvs = customView.findViewById(R.id.botonvis);
            Button botonvr = customView.findViewById(R.id.botonxver);
            Button botonln = customView.findViewById(R.id.botonnlist);
            botonfv.setBackgroundColor(Color.parseColor("#4CAF50"));
            botonln.setBackgroundColor(Color.parseColor("#4CAF50"));
            botonvr.setBackgroundColor(Color.parseColor("#4CAF50"));
            botonvs.setBackgroundColor(Color.parseColor("#4CAF50"));


            botonfv.setOnClickListener(null);
            botonvs.setOnClickListener(null);
            botonvr.setOnClickListener(null);
            botonln.setOnClickListener(null);

            dialog.show();
        });

        TextView hjk=findViewById(R.id.descripcionPelicula);

        if (getIntent().hasExtra("txt")) {
            String textoRecibido = getIntent().getStringExtra("txt");
            hjk.setText(textoRecibido);
        }




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