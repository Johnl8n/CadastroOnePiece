package com.projetoopoo;

import java.util.List;

import com.dao.PersonagemDAO;

public class Personagens {
  
  private int idPersonagem;
  private String nome;
  private String categoria;
  private double reconpensa;
  private String fruta;
  private String arcoEntrou;
  
  public Personagens() {

  }

  public Personagens(String nome, String categoria, double reconpensa, String fruta,
      String arcoEntrou) {
    // this.idPersonagem = idPersonagem;
    this.nome = nome;
    this.categoria = categoria;
    this.reconpensa = reconpensa;
    this.fruta = fruta;
    this.arcoEntrou = arcoEntrou;
  }

  public int getIdPersonagem() {
    return idPersonagem;
  }

  public void setIdPersonagem(int idPersonagem) {
    this.idPersonagem = idPersonagem;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public double getReconpensa() {
    return reconpensa;
  }

  public void setRecompensa(double reconpensa) {
    this.reconpensa = reconpensa;
  }

  public String getFruta() {
    return fruta;
  }

  public void setFruta(String fruta) {
    this.fruta = fruta;
  }

  public String getArcoEntrou() {
    return arcoEntrou;
  }

  public void setArcoEntrou(String arcoEntrou) {
    this.arcoEntrou = arcoEntrou;
  }

  @Override
  public String toString() {
    return "Personagem Encontrado\n\nidPersonagem = " + idPersonagem + "\nNome = " + nome + "\nCategoria = " + categoria + "\nRecompensa = "
        + reconpensa + "\nFruta = " + fruta + "\nArco = " + arcoEntrou + "";
  }


  private static PersonagemDAO dao = new PersonagemDAO();

  public void save(){

    if(dao.buscar(idPersonagem) != null){
      dao.edit(this);
    }else{
    dao.create(this);
    }
  }

  
  public static Personagens delete(int pk){
    return dao.delete(pk);
  }

  public static List<Personagens> listarPersonagens(){
    return dao.listarPersonagens();
  }

  
  public static Personagens buscar(int pk){
    return dao.buscar(pk);
  }




}
