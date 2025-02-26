import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;
import service.*;
import repository.*;

public class MainGUI extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel eventoPanel, participantePanel, ingressoPanel, relatorioPanel;
    private ArquivoRepository repository;
    private Relatorio relatorioService;

    public MainGUI() {
        repository = new ArquivoRepository();
        relatorioService = new Relatorio();

        setTitle("Sistema de Gerenciamento de Eventos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();
        eventoPanel = criarEventoPanel();
        participantePanel = criarParticipantePanel();
        ingressoPanel = criarIngressoPanel();
        relatorioPanel = criarRelatorioPanel();

        tabbedPane.addTab("Eventos", eventoPanel);
        tabbedPane.addTab("Participantes", participantePanel);
        tabbedPane.addTab("Ingressos", ingressoPanel);
        tabbedPane.addTab("Relatórios", relatorioPanel);

        add(tabbedPane);
    }

    private JPanel criarEventoPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JTextField nomeField = new JTextField();
        JTextField dataField = new JTextField();
        JTextField localField = new JTextField();
        JButton adicionarButton = new JButton("Adicionar Evento");
        JButton listarButton = new JButton("Listar Eventos");

        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Data:"));
        panel.add(dataField);
        panel.add(new JLabel("Local:"));
        panel.add(localField);
        panel.add(adicionarButton);
        panel.add(listarButton);

        adicionarButton.addActionListener(e -> {
            Evento evento = new Evento(nomeField.getText(), dataField.getText(), localField.getText());
            repository.salvar(evento);
            JOptionPane.showMessageDialog(this, "Evento adicionado com sucesso!");
        });

        listarButton.addActionListener(e -> {
            java.util.List<Evento> eventos = repository.carregarTodos(Evento.class);
            StringBuilder sb = new StringBuilder();
            for (Evento evento : eventos) {
                sb.append(evento.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Lista de Eventos", JOptionPane.INFORMATION_MESSAGE);
        });

        return panel;
    }

    private JPanel criarParticipantePanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JTextField nomeField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField cpfField = new JTextField();
        JButton adicionarButton = new JButton("Adicionar Participante");
        JButton listarButton = new JButton("Listar Participantes");

        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("CPF:"));
        panel.add(cpfField);
        panel.add(adicionarButton);
        panel.add(listarButton);

        adicionarButton.addActionListener(e -> {
            Participante participante = new Participante(nomeField.getText(), emailField.getText(), cpfField.getText());
            repository.salvar(participante);
            JOptionPane.showMessageDialog(this, "Participante adicionado com sucesso!");
        });

        listarButton.addActionListener(e -> {
            java.util.List<Participante> participantes = repository.carregarTodos(Participante.class);
            StringBuilder sb = new StringBuilder();
            for (Participante participante : participantes) {
                sb.append(participante.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Lista de Participantes", JOptionPane.INFORMATION_MESSAGE);
        });

        return panel;
    }

    private JPanel criarIngressoPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField codigoField = new JTextField();
        JTextField valorField = new JTextField();
        JButton adicionarButton = new JButton("Adicionar Ingresso");
        JButton listarButton = new JButton("Listar Ingressos");

        panel.add(new JLabel("Código:"));
        panel.add(codigoField);
        panel.add(new JLabel("Valor:"));
        panel.add(valorField);
        panel.add(adicionarButton);
        panel.add(listarButton);

        adicionarButton.addActionListener(e -> {
            Ingresso ingresso = new Ingresso(codigoField.getText(), Double.parseDouble(valorField.getText()));
            repository.salvar(ingresso);
            JOptionPane.showMessageDialog(this, "Ingresso adicionado com sucesso!");
        });

        listarButton.addActionListener(e -> {
            java.util.List<Ingresso> ingressos = repository.carregarTodos(Ingresso.class);
            StringBuilder sb = new StringBuilder();
            for (Ingresso ingresso : ingressos) {
                sb.append(ingresso.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Lista de Ingressos", JOptionPane.INFORMATION_MESSAGE);
        });

        return panel;
    }

    private JPanel criarRelatorioPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton relatorioParticipantesButton = new JButton("Relatório de Participantes");
        JButton relatorioVendasButton = new JButton("Relatório de Vendas");

        panel.add(relatorioParticipantesButton);
        panel.add(relatorioVendasButton);

        relatorioParticipantesButton.addActionListener(e -> {
            String relatorio = relatorioService.gerarRelatorioParticipantes();
            JOptionPane.showMessageDialog(this, relatorio, "Relatório de Participantes", JOptionPane.INFORMATION_MESSAGE);
        });

        relatorioVendasButton.addActionListener(e -> {
            String relatorio = relatorioService.gerarRelatorioVendas();
            JOptionPane.showMessageDialog(this, relatorio, "Relatório de Vendas", JOptionPane.INFORMATION_MESSAGE);
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }
}
