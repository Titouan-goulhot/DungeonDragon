package com.company;

import com.company.Enemies.Enemy;
import com.company.Personnage.Personnage;

public interface Fight {


    default void fight(){
        Enemy monster = new Enemy();
        Personnage personnage = new Personnage();
        while (monster.getLife() > 0 && personnage.getLife() > 0) {
            monster.setLife(monster.getLife() - personnage.getStrength());
            System.out.println("Vous attaquez. Vous lui infligez " + personnage.getStrength() + "\n Il lui reste " + monster.getLife());
            if (monster.getLife() > 0) {
                // Puis le monstre réplique
                personnage.setLife(personnage.getLife() - monster.getStrength());
                System.out.println("il vous attaque, vous perdez " + monster.getStrength() + " Point de vie \nIl vous en reste " + personnage.getLife());
            } else {
                System.out.println("Vous l'avez térassé... Vous pouvez continuer ");
            }

        }
    }
}
