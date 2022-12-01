// Utilize os comandos JOptionPane() ou System.out.println() para solicitar os dados de uma Rede Social e assim criar o objeto.
// Você deverá criar dois ou mais objetos do tipo Publicacao. Solicite os dados pelos comandos JOptionPane() ou System.out.println().
// Inserir os objetos do tipo Publicacao na Rede Social
// Chamar o imprimePublicacoes ao final

package br.com.questao1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nomeUsuario, dataNascimento, senha;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o nome do usuário:");
    nomeUsuario = entrada.nextLine();
    System.out.println("Informe sua data de nascimento:");
    dataNascimento = entrada.nextLine();
    System.out.println("Informe sua senha:");
    senha = entrada.nextLine();

    RedeSocial redeSocial = new RedeSocial(nomeUsuario, dataNascimento, senha);

    System.out.println("Digite um texto para sua primeira publicação:");
    String textoPublicacao = entrada.nextLine();
    System.out.println("Link da mídia:");
    String link = entrada.nextLine();
    Publicacao publicacao = new Publicacao(textoPublicacao, link);

    redeSocial.inserePublicacao(publicacao);

    int opcao = 0;
    do {
      System.out.println("Deseja inserir outra publicação? digite 1 para Sim e 2 para não: ");
      opcao = entrada.nextInt();

      switch (opcao) {
        case 1:
          entrada = new Scanner(System.in);
          System.out.println("Digite um texto para publicação:");
          textoPublicacao = entrada.nextLine();
          System.out.println("Link da mídia:");
          link = entrada.nextLine();
          publicacao = new Publicacao(textoPublicacao, link);
          redeSocial.inserePublicacao(publicacao);
          break;
        case 2:
          opcao = 2;
          break;
        default:
          opcao = 2;
          break;
      }
    } while (opcao != 2);

    redeSocial.imprimePublicacoes();
  }

}
