import model.*;
import service.Relatorio;
import utils.Validador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  // Scanner para entrada de dados do usuário
  private static Scanner scanner = new Scanner(System.in);
  // Listas para armazenar eventos, participantes e palestrantes
  private static List<Evento> eventos = new ArrayList<>();
  private static List<Participante> participantes = new ArrayList<>();
  private static List<Palestrante> palestrantes = new ArrayList<>();

  public static void main(String[] args) {
      while (true) {
          // Exibe o menu principal do sistema
          System.out.println("\n ✨Seja bem vindo(a) ao Juntare! Seu assistente completo para organizar eventos com facilidade.✨ ");

          System.out.println("\n O que você deseja fazer?");
          System.out.println("1. Criar novo evento");
          System.out.println("2. Cadastrar participante");
          System.out.println("3. Cadastrar palestrante");
          System.out.println("4. Criar lote de ingressos");
          System.out.println("5. Vender ingresso");
          System.out.println("6. Gerar certificado");
          System.out.println("7. Gerar relatórios");
          System.out.println("8. Sair");
          System.out.print("Escolha uma opção: ");

          int opcao = scanner.nextInt();
          scanner.nextLine(); // Consome a quebra de linha

          // Switch para tratar a opção escolhida pelo usuário
          switch (opcao) {
              case 1:
                  criarEvento(); // Chama o método para criar evento
                  break;
              case 2:
                  cadastrarParticipante(); // Chama o método para cadastrar participante
                  break;
              case 3:
                  cadastrarPalestrante(); // Chama o método para cadastrar palestrante
                  break;
              case 4:
                  criarLoteIngressos(); // Chama o método para criar lote de ingressos
                  break;
              case 5:
                  venderIngresso(); // Chama o método para vender ingresso
                  break;
              case 6:
                  gerarCertificado(); // Chama o método para gerar certificado
                  break;
              case 7:
                  menuRelatorios(); // Chama o método para gerar relatórios
                  break;
              case 8:
                  System.out.println("Encerrando o sistema em 3, 2, 1..."); // Mensagem de encerramento
                  return;
              default:
                  System.out.println("Opa! Opção inválida😵"); // Mensagem de erro para opção inválida
          }
      }
  }

  private static void criarEvento() {
      System.out.println("\n Criar Novo Evento ⏳");
      System.out.print("Nome do evento: ");
      String nome = scanner.nextLine();

      System.out.print("Local📍: ");
      String local = scanner.nextLine();

      System.out.print("Capacidade máxima: ");
      int capacidade = scanner.nextInt();
      scanner.nextLine(); // Consome a quebra de linha

      System.out.print("Data (dd/MM/yyyy HH:mm)📆🕑: ");
      String dataStr = scanner.nextLine();
      LocalDateTime data = LocalDateTime.parse(dataStr, 
          DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

      Evento evento = new Evento(nome, data, local, capacidade); // Criação do evento
      eventos.add(evento); // Adiciona o evento à lista de eventos
      System.out.println("Evento criado com sucesso!✅ ID: " + evento.getId());
  }

  private static void cadastrarParticipante() {
      System.out.println("\n Cadastrar Participante ");
      System.out.print("Nome: ");
      String nome = scanner.nextLine();

      System.out.print("Email: ");
      String email = scanner.nextLine();
      while (!Validador.validarEmail(email)) { // Validação do email
          System.out.println("Email inválido!😵 Tente novamente: ");
          email = scanner.nextLine();
      }

      System.out.print("CPF: ");
      String cpf = scanner.nextLine();
      while (!Validador.validarCPF(cpf)) { // Validação do CPF
          System.out.println("CPF inválido!😵 Tente novamente: ");
          cpf = scanner.nextLine();
      }

      Participante participante = new Participante(nome, email, cpf); // Criação do participante
      participantes.add(participante); // Adiciona o participante à lista
      System.out.println("Participante cadastrado com sucesso!✅ ID: " + participante.getId());
  }

  private static void cadastrarPalestrante() {
      System.out.println("\n Cadastrar Palestrante ");
      System.out.print("Nome: ");
      String nome = scanner.nextLine();

      System.out.print("Email: ");
      String email = scanner.nextLine();
      while (!Validador.validarEmail(email)) { // Validação do email
          System.out.println("Email inválido!😵 Tente novamente: ");
          email = scanner.nextLine();
      }

      System.out.print("CPF: ");
      String cpf = scanner.nextLine();
      while (!Validador.validarCPF(cpf)) { // Validação do CPF
          System.out.println("CPF inválido!😵 Tente novamente: ");
          cpf = scanner.nextLine();
      }

      System.out.print("Especialidade: ");
      String especialidade = scanner.nextLine();

      Palestrante palestrante = new Palestrante(nome, email, cpf, especialidade); // Criação do palestrante
      palestrantes.add(palestrante); // Adiciona o palestrante à lista
      System.out.println("Palestrante cadastrado com sucesso!✅ ID: " + palestrante.getId());
  }
}
