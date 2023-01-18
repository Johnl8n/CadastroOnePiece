package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Abre a conecção com o BD
public class Conexaos {
  private static String url = "jdbc:mysql://localhost:3306/one";
    private static String user = "root";
    private static String pass = "";
    // Statement sqlmgr;
  
    protected static Connection conn;
    public static <conn> Connection abrir() {
    try {
      conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Banco encontrado: ");
      return conn;
    
    }catch (SQLException e) {
      e.printStackTrace();
      System.out.println("Drive não encontrado.");
      
    }
    return null;
  }
}
