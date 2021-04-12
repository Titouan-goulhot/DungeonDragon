package com.company;

import com.company.Personnage.Personnage;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class BDD {
    String url = "jdbc:mysql://localhost:3307/dungeon&dragon?serverTimezone=UTC";
    String userName = "root";
    String password = "root";
    String REQUETE = "INSERT INTO playersaved(name, health, attack)  VALUES(?, ?, ?)";
    PreparedStatement statement;

    public void savePlayer(Personnage player) {

        //ATTRIBUTS

        String url = "jdbc:mysql://localhost:3307/dungeon&dragon?serverTimezone=UTC";
        String userName = "root";
        String password = "root";
        String REQUETE = "INSERT INTO playersaved(name, health, attack)  VALUES(?, ?, ?)";
        PreparedStatement statement;

        //Connexion et Sauvegarde du Personnage en BDD

        try {

            Connection con = DriverManager.getConnection(url, userName, password);
            statement = con.prepareStatement(REQUETE);
            statement.setString(1, player.getName());
            statement.setInt(2, player.getLife());
            statement.setInt(3, player.getStrength());


            statement.execute();


            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showPlayers(){
        //Affichage des infos dans la BDD Dungeon&Dragon
        try{
            ResultSet result = statement.executeQuery("Select * from playersaved");
            System.out.println("Voici la liste des héros sauvegardés :");
            while (result.next())
                System.out.println(
                        "name : " + result.getString(1) + "\n" +
                                "health : " + result.getInt(2) + "\n" +
                                "attack : " + result.getInt(3) +
                                "\n"
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
