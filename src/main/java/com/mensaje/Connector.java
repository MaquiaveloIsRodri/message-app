package com.mensaje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3308/mensajes", "root", "");
            if(connection!=null){
                System.out.println("Coneccion exitosa");
            }

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return connection;
    }
}
