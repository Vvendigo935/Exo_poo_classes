package org.example.EXO.exoPoo_Classes.Exo_lachaise;

public class CatalogueChaise {
    public static void main(String[] args) {

       Chaise chaise1 = new Chaise(4, "chaine", "bleue", 14.40);
        Chaise chaise2 = new Chaise(3, "bambou", "gris", 130.99);
        Chaise chaise3 = new Chaise(1, "métal", "orange", 76.25);

        System.out.println(chaise1);
        System.out.println(chaise2);
        System.out.println(chaise3);
    }
}
