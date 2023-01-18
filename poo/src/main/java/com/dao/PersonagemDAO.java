package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.Conexaos;
import com.projetoopoo.Personagens;


public class PersonagemDAO extends Conexaos{

  //Inserção de dados no BD
  
  public void create(Personagens p){

    abrir();

    try{
      PreparedStatement stm = conn.prepareStatement("INSERT INTO personagem(nome,categoria,reconpensa,fruta,arcoEntrou) VALUES(?,?,?,?,?);");
      // stm.setInt(1, p.getIdPersonagem());
      stm.setString(1, p.getNome());
      stm.setString(2, p.getCategoria());
      stm.setDouble(3, p.getReconpensa());
      stm.setString(4, p.getFruta());
      stm.setString(5, p.getArcoEntrou());

      stm.executeUpdate();

      // (nome, categoria, reconpensa, fruta, arcoEntrou)
      System.out.println("Personagem Cadastrado!");
    }catch (SQLException e){
      e.printStackTrace();
    }finally{

      try{
        if(conn != null){
          conn.close();
        }
        if(conn != null){
          conn.close();
        }

      }catch (Exception e){
        e.printStackTrace();
      }
    }

  }
    
  
  //Faz uma consulta no BD e retorna todos os dados que estão dentro da tabela
  
  public static List<Personagens> listarPersonagens(){
    ArrayList<Personagens> resu = new ArrayList<>();
    
    abrir();

     try{
        PreparedStatement stm = conn.prepareStatement("SELECT * FROM personagem ORDER BY idPersonagem ASC;");

        ResultSet rs = stm.executeQuery();

    while (rs.next()) {
      
       Personagens p = new Personagens();
       
       p.setIdPersonagem(rs.getInt("idPersonagem"));
       p.setNome(rs.getString("nome"));
       p.setCategoria(rs.getString("categoria"));
       p.setRecompensa(rs.getDouble("reconpensa"));
       p.setFruta(rs.getString("fruta"));
       p.setArcoEntrou(rs.getString("arcoEntrou"));

        resu.add(p);

    }

    }catch (SQLException e){
      e.printStackTrace();
    }
 
    
  return resu;
  }
  
  //Editar dados no BD
  public void edit(Personagens p){

    conn = abrir();

    try {
      
      PreparedStatement stm = conn.prepareStatement("UPDATE `one`.`personagem` SET `nome` = ?, `categoria` = ?, `reconpensa` = ?, `fruta` = ?, `arcoEntrou` = ? WHERE (`idPersonagem` = ?);");

      stm.setString(1, p.getNome());
      stm.setString(2, p.getCategoria());
      stm.setDouble(3, p.getReconpensa() );
      stm.setString(4, p.getFruta());
      stm.setString(5, p.getArcoEntrou());
      stm.setInt(6, p.getIdPersonagem());

      stm.executeUpdate();

    } catch (SQLException e) {

      e.printStackTrace();
    }finally{

    }

  }

  //Deletar dados no BD
  public Personagens delete(int pk)  {

    conn = abrir();

    try {
      PreparedStatement stm = conn.prepareStatement("DELETE  FROM personagem WHERE idPersonagem = ?;");
      stm.setInt(1, pk);

      stm.executeUpdate();

      System.out.println("Personagem Deletado!");
    } catch (SQLException e) {

      e.printStackTrace();
    }
    return null;
  }

  //Buscar informações no BD
  public Personagens buscar(int pk) {
    Personagens resu = null;
    conn = abrir();

    try {
      PreparedStatement stm = conn.prepareStatement("SELECT * FROM personagem WHERE idPersonagem = ?;");
      stm.setInt(1, pk);

      ResultSet rs = stm.executeQuery();

      if (rs.next()) {
        Personagens p = new Personagens(
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6));

        resu = p;

        System.out.println(resu);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return resu;
  }

}