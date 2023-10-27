package com.example.moviefan1;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class popUpCreador {

    @SuppressLint("SetTextI18n")
    public static void mostrarPopUp(Context context, ImageButton button, String message, int precio, int imageResource) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        LinearLayout layt = new LinearLayout(context);
        layt.setOrientation(LinearLayout.VERTICAL);
        layt.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(300, 300, 300, 300);
        layt.setLayoutParams(layoutParams);


        ImageView imagen = new ImageView(context);
        @SuppressLint("UseCompatLoadingForDrawables") Drawable drawable = context.getResources().getDrawable(imageResource);
        imagen.setImageDrawable(drawable);
        imagen.setAdjustViewBounds(true);
        imagen.setMaxHeight(300);
        imagen.setMaxWidth(300);
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        imageParams.gravity = Gravity.START;
        imagen.setLayoutParams(imageParams);
        layt.addView(imagen);

        TextView textocalculo = new TextView(context);
        textocalculo.setText("Ingrese cotizacion del dolar tarjeta a dia de hoy");
        textocalculo.setGravity(Gravity.CENTER);
        textocalculo.setPadding(0, 20, 0, 0);
        layt.addView(textocalculo);

        EditText texto = new EditText(context);
        layt.addView(texto);

        Button botoncalculo = new Button(context);
        botoncalculo.setText("Precio Ars");
        layt.addView(botoncalculo);

        TextView resultTextView = new TextView(context);
        layt.addView(resultTextView);

        botoncalculo.setOnClickListener(v -> {
            String input = texto.getText().toString();
            if (!input.isEmpty()) {
                double value = Double.parseDouble(input);
                double result = value * precio;
                resultTextView.setText("El precio en pesos Argentinos es de: " + result);
            } else {
                resultTextView.setText("Por favor ingrese un número");
            }
        });


        builder.setView(layt)
                .setMessage(message+" "+precio+"$ Dolares")
                .setPositiveButton("Cerrar", (dialog, id) -> dialog.dismiss());
        AlertDialog dialog = builder.create();
        button.setOnClickListener(v -> dialog.show());
    }
}