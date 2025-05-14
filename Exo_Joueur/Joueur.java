package org.example.EXO.exoPoo_Classes.Exo_Joueur;

public class Joueur {

    private String nom;
    private int lvl;
    private int xp;

    public Joueur(String nom) {
        this.lvl = 1;
        this.nom = nom;
        this.xp = 0;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void doQuest(int addXp, int iQuest){
        xp += addXp;
        iQuest++;
        if (xp >= 100){
            lvl++;
            xp = 0;
            System.out.println("Le joueur "+this.nom+" passe au niveau "+this.lvl);
        }else System.out.println(" Le joueur "+this.nom+" effectue la quête n°"+iQuest);
    }


}
