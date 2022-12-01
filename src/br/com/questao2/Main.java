package br.com.questao2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    AchadoPerdido achadoPerdido = new AchadoPerdido("Titulo de Teste", "Descrição de Teste", "Tipo Teste", "Teste");
    achadoPerdido.completaDados("Foto Teste", "Local Achado Teste", "Data e Hora Teste");
    boolean busca = achadoPerdido.buscarTitulo(achadoPerdido.getTitulo());
    if (busca == true) {
      JOptionPane.showMessageDialog(null, "Titulo Encontrado!");
    } else {
      JOptionPane.showMessageDialog(null, "Não foi possível encontrar Titulo pesquisado!");
    }
    JOptionPane.showMessageDialog(null, achadoPerdido.visualizar());
  }
}
