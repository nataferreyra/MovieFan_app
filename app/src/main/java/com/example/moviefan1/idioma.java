package com.example.moviefan1;

class Idioma {
    private static boolean idioma = true;

    public static void setIdioma(boolean nuevoIdioma) {
        idioma = nuevoIdioma;
    }

    public static boolean getIdioma() {
        return idioma;
    }

    public static void cambiar() {
        idioma = !idioma;
    }

}
