package com.javaDA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    public Connection c;
    public Statement s;
    public conn(){
        try{
             c = DriverManager.getConnection("jdbc:mysql://localhost:8889/VitCricLeague","root","root");
            s = c.createStatement();
            System.out.println("Connection established");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
