package org.example.EXO.exoPoo_Classes.Exo_Plante;

public class Plante {

    private String nom;
    private int hauteur;
    private String couleur;

    public Plante(int circTronc) {
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Plante(String couleur, int hauteur, String nom) {
        this.couleur = couleur;
        this.hauteur = hauteur;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "info sur la Plante{" +
                "couleur='" + couleur + '\'' +
                ", nom='" + nom + '\'' +
                ", hauteur=" + hauteur +
                '}';
    }
}
