package org.example.EXO.exoPoo_Classes.Exo_Plante;

public class Main_Plante {
    public static void main(String[] args) {

        Plante plante1 = new Plante("Bleu", 38, "bleuets");
        Plante plante2 = new Plante("Rouge", 20, "Rose");
        Arbre arbre1 = new Arbre(35);

        System.out.println(plante1.toString());
        System.out.println(plante2.toString());
        System.out.println(arbre1.toString());
    }
}
