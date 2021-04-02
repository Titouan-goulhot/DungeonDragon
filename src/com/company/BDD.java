package com.company;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BDD {

    public static void main(String[] args){


        String url ="jdbc:mysql://localhost:3306/dungeon&dragon?serverTimezone=UTC";
        String userName = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement statement = con.createStatement();
            statement.execute("insert into player(name) values('clavier')");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
