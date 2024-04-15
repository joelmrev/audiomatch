package com.aluracursos.principal;

import com.aluracursos.audiomatch.modelos.Cancion;
import com.aluracursos.audiomatch.modelos.MisFavoritos;
import com.aluracursos.audiomatch.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        MisFavoritos favoritos = new MisFavoritos();

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Demons");
        miCancion.setDuracion(3);
        miCancion.setCantante("Imagine Dragons");

        System.out.println(miCancion.getTitulo());
        System.out.println(miCancion.getDuracion());
        System.out.println(miCancion.getCantante());

        System.out.println("************************");

        for (int i = 0; i < 5000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000 ; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());
        System.out.println("Reproducciones:" + miCancion.getTotalDeReproducciones());
        favoritos.incluye(miCancion);

        System.out.println("*****************************************");

//       ------------------------- PODCAST  ---------------------------
        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("PicPodcast");
        miPodcast.setPresentador("Alejandro Sago");
        miPodcast.setDuracion(1.3);
        miPodcast.setInvitado("yo, jaja");

        System.out.println(miPodcast.getTitulo());
        System.out.println(miPodcast.getPresentador());
        System.out.println(miPodcast.getDuracion());
        System.out.println(miPodcast.getInvitado());

        for (int i = 0; i < 1000; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000 ; i++) {
            miPodcast.reproduce();
        }

        System.out.println("**************************************");
        System.out.println("Total de Me Gusta: " + miPodcast.getTotalDeMeGusta());
        System.out.println("Reproducciones:" + miPodcast.getTotalDeReproducciones());
        favoritos.incluye(miPodcast);





    }
}
