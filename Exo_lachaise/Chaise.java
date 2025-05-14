package org.example.EXO.exoPoo_Classes.Exo_lachaise;

public class Chaise {

    private int pieds;
    private String materiaux;
    private String couleur;
    private double prix;

    public Chaise(int pieds, String materiaux, String couleur, double prix){
        this.couleur = couleur;
        this.materiaux = materiaux;
        this.pieds = pieds;
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Je suis une chaise a "+this.pieds+" pieds fait en "+this.materiaux+" de couleur "+this.couleur+" qui coute "+this.prix+" €";
    }
}
