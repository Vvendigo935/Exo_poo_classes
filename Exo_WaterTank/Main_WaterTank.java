package org.example.EXO.exoPoo_Classes.Exo_WaterTank;

public class Main_WaterTank {
    public static void main(String[] args) {


        WaterTank wt1 = new WaterTank(10);
        WaterTank wt2 = new WaterTank(25);

        int tot = wt1.getCapMax()+wt2.getCapMax();

        System.out.println("info de la cuve 1 : "+wt1.toString());
        System.out.println("info de la cuve 2 : "+wt2.toString());
        System.out.println("capacité additionées des cuves : "+tot);

        // test des methodes
        wt1.remplir(150);
        wt2.remplir(150);

        // test de trop plein ou trop vide
        wt1.vider(300);
        wt1.remplir(300);

    }
}
