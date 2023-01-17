package com.persoapp;

import com.dao.PersonagemDAO;
import com.projetoopoo.Personagens;
import com.view.Inicio;

import static com.view.Inicio.preencherTabela;

public class Main {
  public static void main(String[] args) {
      Inicio tela = new Inicio();
      tela.setVisible(true);

      preencherTabela();
  }
}
