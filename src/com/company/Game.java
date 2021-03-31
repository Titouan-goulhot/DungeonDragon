package com.company;

import com.company.Enemies.Enemy;
import com.company.Personnage.Personnage;
import com.company.Personnage.Warrior;
import com.company.Personnage.Wizard;
import com.company.Plateau.*;

import java.util.Scanner;

public class Game {

    Scanner clavier = new Scanner(System.in);

    // Fonction qui fait appel à l'accueuil du joueur
    public void mainMenu() {
        System.out.println("\n" +
                "8888888b.                                                               .d8888b.           8888888b.                                              \n" +
                "888  \"Y88b                                                             d88P  \"88b          888  \"Y88b                                             \n" +
                "888    888                                                             Y88b. d88P          888    888                                             \n" +
                "888    888 888  888 88888b.   .d88b.   .d88b.   .d88b.  88888b.         \"Y8888P\"           888    888 888d888  8888b.   .d88b.   .d88b.  88888b.  \n" +
                "888    888 888  888 888 \"88b d88P\"88b d8P  Y8b d88\"\"88b 888 \"88b       .d88P88K.d88P       888    888 888P\"       \"88b d88P\"88b d88\"\"88b 888 \"88b \n" +
                "888    888 888  888 888  888 888  888 88888888 888  888 888  888       888\"  Y888P\"        888    888 888     .d888888 888  888 888  888 888  888 \n" +
                "888  .d88P Y88b 888 888  888 Y88b 888 Y8b.     Y88..88P 888  888       Y88b .d8888b        888  .d88P 888     888  888 Y88b 888 Y88..88P 888  888 \n" +
                "8888888P\"   \"Y88888 888  888  \"Y88888  \"Y8888   \"Y88P\"  888  888        \"Y8888P\" Y88b      8888888P\"  888     \"Y888888  \"Y88888  \"Y88P\"  888  888 \n" +
                "                                  888                                                                                       888                   \n" +
                "                             Y8b d88P                                                                                  Y8b d88P                   \n" +
                "                              \"Y88P\"                                                                                    \"Y88P\"                    \n");


        System.out.print("Bienvenue dans Dungeon&Dragon. Voulez-vous créer un nouveau personnage ? 1-oui 2-non");
        String response = clavier.nextLine();

        if (response.equals("1")) {
            System.out.print("Excellent choix ! ");
            createCharacter();
        } else {
            System.out.print("Et bah revient quand tu seras décidé !");

        }
    }

    //Création d'un personnage
    public void createCharacter() {
        System.out.println("Choisissez votre classe : ");
        System.out.println(" 1- Warrior ");
        System.out.println("2- Wizard ");

        // On récupère le 1 ou 2 dans la variable character

        int warrior = 1;
        int character = clavier.nextInt();

        //Polymorphisme = "un warrior est un personnage MAIS un personnage n'est pas forcement un WARRIOR"
        Personnage player;

        if (character == warrior) { // SI c'est Warrior ..
            player = new Warrior();
            System.out.println("Un guerrier... un vrai !");

        } else { // Si c'est Wizzard ...
            player = new Wizard();
            System.out.println("Why not !");
        }

        System.out.println("C'est quoi ton petit nom ? ");
        Scanner clavier = new Scanner(System.in);
        String name = clavier.nextLine();
        //La méthode SetName s'appliquera bien à la bonne classe...
        player.setName(name);
        System.out.println(player.toString());
        System.out.println("Est-ce que ça te convient ? ");
        System.out.println(">1 - Allons-y ! ");
        System.out.println(">2 - Heu... j'imaginais pas ça comme ça... ");
        character = clavier.nextInt();
        if (character == 2) {
            System.out.println("Alors recommençons...");
            createCharacter();
        }
        game(player);

        // PAS DE INSTANCE OF !
    }

    public void game(Personnage player) {

        Dice die = new Dice();
        System.out.println("Alors Go ! Vous commencez à la Case 0\n----------------------------------------------------- ");
        Board board = new Board();


        do {
            int lance = die.randomDice();

            //On s'assure dans le setter de ne pas dépasser la case 64
            try {

                board.setCurrentPlace(board.getCurrentPlace() + lance);
            } catch (PersonnageHorsPlateauException e) {
                System.out.println(e.getMessage());

            }


            System.out.println("Le dés a fait " + lance + "\n-----------------------------------------");
            System.out.println(board.toString());
            board.fillBoard();
            board.getBoard().get(board.getCurrentPlace()).interaction(player);
            // Envisager les 3 sorties possibles du combat : win / loose / fuite


        }
        while (board.getCurrentPlace() < 64 && player.getLife() > 0);


        gameOver(player);

    }

    public void gameOver(Personnage player) {
        if (player.getLife() <= 0) {
            System.out.println("Aïe... c'était le coup de trop... Ton coeur a laché et pour des raisons de restriction budgetaire, il n'y à pas de défibrillateur... Sorry but : \" +\n\n" +
                    "   ▄██████▄     ▄████████   ▄▄▄▄███▄▄▄▄      ▄████████       ▄██████▄   ▄█    █▄     ▄████████    ▄████████ \n" +
                    "  ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███      ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                    "  ███    █▀    ███    ███ ███   ███   ███   ███    █▀       ███    ███ ███    ███   ███    █▀    ███    ███ \n" +
                    " ▄███          ███    ███ ███   ███   ███  ▄███▄▄▄          ███    ███ ███    ███  ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                    "▀▀███ ████▄  ▀███████████ ███   ███   ███ ▀▀███▀▀▀          ███    ███ ███    ███ ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                    "  ███    ███   ███    ███ ███   ███   ███   ███    █▄       ███    ███ ███    ███   ███    █▄  ▀███████████ \n" +
                    "  ███    ███   ███    ███ ███   ███   ███   ███    ███      ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                    "  ████████▀    ███    █▀   ▀█   ███   █▀    ██████████       ▀██████▀   ▀██████▀    ██████████   ███    ███ \n" +
                    "                                                                                                 ███    ███ \n"
            );
        } else {
            System.out.println("System.out.println(\"\\n\" +\n" +
                    "                \" ▄█    █▄   ▄█   ▄████████     ███      ▄██████▄     ▄████████ ▄██   ▄   \\n\" +\n" +
                    "                \"███    ███ ███  ███    ███ ▀█████████▄ ███    ███   ███    ███ ███   ██▄ \\n\" +\n" +
                    "                \"███    ███ ███▌ ███    █▀     ▀███▀▀██ ███    ███   ███    ███ ███▄▄▄███ \\n\" +\n" +
                    "                \"███    ███ ███▌ ███            ███   ▀ ███    ███  ▄███▄▄▄▄██▀ ▀▀▀▀▀▀███ \\n\" +\n" +
                    "                \"███    ███ ███▌ ███            ███     ███    ███ ▀▀███▀▀▀▀▀   ▄██   ███ \\n\" +\n" +
                    "                \"███    ███ ███  ███    █▄      ███     ███    ███ ▀███████████ ███   ███ \\n\" +\n" +
                    "                \"███    ███ ███  ███    ███     ███     ███    ███   ███    ███ ███   ███ \\n\" +\n" +
                    "                \" ▀██████▀  █▀   ████████▀     ▄████▀    ▀██████▀    ███    ███  ▀█████▀  \\n\" +\n" +
                    "                \"                                                    ███    ███           \\n\");");

        }
        System.out.println("Ce fut rapide... Mais vous avez finit le jeu");
        System.out.println("Voulez-vous rejouer ? ");
        System.out.println(">1 - Encooore ! ");
        System.out.println(">2- C'est bon j'ai eu ma dose...");
        int replay = clavier.nextInt();
        if (replay == 1) {
            createCharacter();
            game(player);
        } else {
            System.out.println("Et bah à la prochaine alors...");


        }
    }

}
