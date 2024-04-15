package com.aluracursos.audiomatch.modelos;

public class MisFavoritos extends Audio {

    public void incluye(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " es uno de los Favoritos del momento.");
        } else System.out.println(audio.getTitulo() + " también es de uno de los favoritos.");

    }
}
