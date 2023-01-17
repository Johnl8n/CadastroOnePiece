package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// public class Conexaos{

//   private static final String user = "root";

//   private static final String pass = "";

//   private static final String url = "jdbc:mysql://localhost:3306/one";

//   public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException{
//     Class.forName("com.mysql.jdbc.Driver");

//     Connection connection = DriverManager.getConnection(url, user, pass);

//     return connection;
//   }

//   public static void main(String[] args) throws SQLException, ClassNotFoundException{

//     Connection con = createConnectionToMySQL();

//     if(con == null){
//       System.out.println("Conexão feita!!");
//       con.close();
//     }

//   }

// }












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
