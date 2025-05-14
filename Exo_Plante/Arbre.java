package org.example.EXO.exoPoo_Classes.Exo_Plante;

public class  Arbre extends Plante {

    private int circTronc;

    public Arbre(int circTronc) {
        super(circTronc);
        this.circTronc = circTronc;
    }

    @Override
    public String toString() {
        return "Arbre{" +
                "circTronc=" + circTronc +
                '}';
    }
}