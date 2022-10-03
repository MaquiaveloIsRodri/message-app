package com.mensaje;

import java.sql.Connection;

public class Inicio{
    public static void main(String[] args) {
        Connector conexion = new Connector();
        try(Connection cnx = conexion.getConnection()){}
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
