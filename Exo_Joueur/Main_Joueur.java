package org.example.EXO.exoPoo_Classes.Exo_Joueur;

import java.util.Scanner;

public class Main_Joueur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Joueur joueur = new Joueur("Le Warrior du 59");

// si on veut voir son nom, xp et lvl
        System.out.println(joueur.getLvl());
        System.out.println(joueur.getXp());
        System.out.println(joueur.toString());

        // je vais créer une boucle qui va amener le joueur a prendre de l'exp
        // par rapport au nombre de quête qu'il va vouloir faire
        System.out.println("Combien de quête souhaitez vous faire ?");
        int q = scanner.nextInt();

        for(int i = 1; i >= q; i++ ){
            System.out.println(joueur+" a terminé la quête n°"+i);
            joueur.doQuest(10,1);
        }

        System.out.println("Saisissez votre nouveau pseudo : ");
        String name = scanner.nextLine();
        joueur.setNom(name);
        System.out.println(joueur.toString());

    }
}
