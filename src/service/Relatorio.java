package service;

import model.*;
import java.util.List;

public class Relatorio {
  public static void gerarRelatorioParticipantes(Evento evento) {
      System.out.println("=== Relatório de Participantes ===");
      System.out.println("Evento: " + evento.getNome());
      System.out.println("Data: " + evento.getData());
      System.out.println("Local: " + evento.getLocal());
      System.out.println("Participantes:");
      
      List<Participante> participantes = evento.getParticipantes();
      for (Participante p : participantes) {
          System.out.println("- " + p.getNome() + " (" + p.getEmail() + ")");
      }
      
      System.out.println("Total de participantes: " + participantes.size());
  }

  public static void gerarRelatorioIngressosVendidos(Evento evento) {
      System.out.println("=== Relatório de Ingressos Vendidos ===");
      System.out.println("Evento: " + evento.getNome());
      
      List<LoteIngresso> lotes = evento.getLotes();
      for (LoteIngresso lote : lotes) {
          System.out.println("Lote " + lote.getId());
          System.out.println("Preço: R$ " + String.format("%.2f", lote.getPreco()));
          System.out.println("Ingressos disponíveis: " + lote.getQuantidade());
      }
  }

  public static void gerarRelatorioPalestrantes(Evento evento) {
      System.out.println("=== Relatório de Palestrantes ===");
      System.out.println("Evento: " + evento.getNome());
      System.out.println("Palestrantes:");
      
      List<Palestrante> palestrantes = evento.getPalestrantes();
      for (Palestrante p : palestrantes) {
          System.out.println("- " + p.getNome());
          System.out.println("  Especialidade: " + p.getEspecialidade());
          System.out.println("  Contato: " + p.getEmail());
      }
      
      System.out.println("Total de palestrantes: " + palestrantes.size());
  }
}
