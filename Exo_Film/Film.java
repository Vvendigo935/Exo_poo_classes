package org.example.EXO.exoPoo_Classes.Exo_Film;

import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private String sortie;
    private String genre;

    public Film(String genre, String realisateur, String sortie, String titre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.sortie = sortie;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getSortie() {
        return sortie;
    }

    public void setSortie(String sortie) {
        this.sortie = sortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "genre='" + genre + '\'' +
                ", titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", sortie=" + sortie +
                '}';
    }
}
