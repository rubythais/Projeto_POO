package service;

import model.*;
import repository.ArquivoRepository;
import java.util.List;

public class Relatorio {
    private ArquivoRepository repository;

    public Relatorio() {
        this.repository = new ArquivoRepository();
    }

    public String gerarRelatorioParticipantes() {
        List<Participante> participantes = repository.carregarTodos(Participante.class);
        StringBuilder sb = new StringBuilder("Relatório de Participantes:\n");
        for (Participante p : participantes) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public String gerarRelatorioVendas() {
        List<Ingresso> ingressos = repository.carregarTodos(Ingresso.class);
        double totalVendas = 0;
        StringBuilder sb = new StringBuilder("Relatório de Vendas:\n");
        for (Ingresso i : ingressos) {
            sb.append(i.toString()).append("\n");
            totalVendas += i.getValor();
        }
        sb.append("Total de vendas: R$").append(totalVendas);
        return sb.toString();
    }
}
