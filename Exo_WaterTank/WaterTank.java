package org.example.EXO.exoPoo_Classes.Exo_WaterTank;

public class WaterTank {

    private int capMax = 300;
    private int nivRemplissage;
    private int poidVide = capMax - nivRemplissage;

    public WaterTank(int nivRemplissage) {
        this.capMax = capMax;
        this.nivRemplissage = nivRemplissage;
        this.poidVide = poidVide;
    }

    public void remplir(int ajouter) {
        if (nivRemplissage < (capMax - ajouter)) {
            nivRemplissage += ajouter;
            System.out.println(nivRemplissage);
        } else System.out.println("Trop plein !");
    }
         public void vider (int retirer){
            if (nivRemplissage > retirer){
                nivRemplissage -= retirer;
            }else System.out.println("Pas assez de volume dispo");
        }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getNivRemplissage() {
        return nivRemplissage;
    }

    public void setNivRemplissage(int nivRemplissage) {
        this.nivRemplissage = nivRemplissage;
    }

    public int getPoidVide() {
        return poidVide;
    }

    public void setPoidVide(int poidVide) {
        this.poidVide = poidVide;
    }

    @Override
    public String toString() {
        return "WaterTank{" +
                "capMax=" + capMax +
                ", nivRemplissage=" + nivRemplissage +
                ", poidVide=" + poidVide +
                '}';
    }
}