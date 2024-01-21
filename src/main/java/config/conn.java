/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rsstst
 */
public class conn {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/uas_data?allowMultiQueries=true";
        String user = "root";
        String psw = "";
        try {
            conn = DriverManager.getConnection(url, user, psw);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String [] args){
        try {
            Connection c = conn.getConnection();
            System.out.println(String.format("Terkoneksi ke database", c.getCatalog()));
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public static PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
