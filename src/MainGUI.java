import model.*;
import service.Relatorio;
import utils.Validador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MainGUI extends JFrame {
    private List<Evento> eventos = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();
    private List<Palestrante> palestrantes = new ArrayList<>();
    
    private JTabbedPane tabbedPane;
    private JTable eventoTable;
    private JTable participanteTable;
    private DefaultTableModel eventoModel;
    private DefaultTableModel participanteModel;
    private JLabel statusLabel;
    
    public MainGUI() {
        // Configuração básica da janela
        setTitle("Sistema de Gerenciamento de Eventos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Criar menu
        JMenuBar menuBar = new JMenuBar();
        
        JMenu arquivoMenu = new JMenu("Arquivo");
        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.addActionListener(e -> System.exit(0));
        arquivoMenu.add(sairItem);
        
        JMenu eventoMenu = new JMenu("Eventos");
        JMenuItem novoEventoItem = new JMenuItem("Novo Evento");
        novoEventoItem.addActionListener(e -> criarEvento());
        eventoMenu.add(novoEventoItem);
        
        JMenu participanteMenu = new JMenu("Participantes");
        JMenuItem novoParticipanteItem = new JMenuItem("Novo Participante");
        novoParticipanteItem.addActionListener(e -> criarParticipante());
        participanteMenu.add(novoParticipanteItem);
        
        JMenu ajudaMenu = new JMenu("Ajuda");
        JMenuItem sobreItem = new JMenuItem("Sobre");
        sobreItem.addActionListener(e -> JOptionPane.showMessageDialog(this, 
                "Sistema de Gerenciamento de Eventos\nVersão 1.0\nDesenvolvido para a disciplina de POO", 
                "Sobre", JOptionPane.INFORMATION_MESSAGE));
        ajudaMenu.add(sobreItem);
        
        menuBar.add(arquivoMenu);
        menuBar.add(eventoMenu);
        menuBar.add(participanteMenu);
        menuBar.add(ajudaMenu);
        
        setJMenuBar(menuBar);
        
        // Criar painel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Criar barra de ferramentas
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        
        JButton novoEventoBtn = new JButton("Novo Evento");
        novoEventoBtn.addActionListener(e -> criarEvento());
        
        JButton novoParticipanteBtn = new JButton("Novo Participante");
        novoParticipanteBtn.addActionListener(e -> criarParticipante());
        
        toolBar.add(novoEventoBtn);
        toolBar.addSeparator();
        toolBar.add(novoParticipanteBtn);
        
        mainPanel.add(toolBar, BorderLayout.NORTH);
        
        // Criar abas
        tabbedPane = new JTabbedPane();
        
        // Aba de Eventos
        JPanel eventoPanel = new JPanel(new BorderLayout());
        eventoModel = new DefaultTableModel(
                new Object[][] {},
                new String[] {"Nome", "Local", "Data", "Capacidade"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        eventoTable = new JTable(eventoModel);
        JScrollPane eventoScroll = new JScrollPane(eventoTable);
        eventoPanel.add(eventoScroll, BorderLayout.CENTER);
        
        JPanel eventoBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton addEventoBtn = new JButton("Adicionar Evento");
        addEventoBtn.addActionListener(e -> criarEvento());
        eventoBtnPanel.add(addEventoBtn);
        eventoPanel.add(eventoBtnPanel, BorderLayout.SOUTH);
        
        tabbedPane.addTab("Eventos", eventoPanel);
        
        // Aba de Participantes
        JPanel participantePanel = new JPanel(new BorderLayout());
        participanteModel = new DefaultTableModel(
                new Object[][] {},
                new String[] {"Nome", "Email", "CPF"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        participanteTable = new JTable(participanteModel);
        JScrollPane participanteScroll = new JScrollPane(participanteTable);
        participantePanel.add(participanteScroll, BorderLayout.CENTER);
        
        JPanel participanteBtnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton addParticipanteBtn = new JButton("Adicionar Participante");
        addParticipanteBtn.addActionListener(e -> criarParticipante());
        participanteBtnPanel.add(addParticipanteBtn);
        participantePanel.add(participanteBtnPanel, BorderLayout.SOUTH);
        
        tabbedPane.addTab("Participantes", participantePanel);
        
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
        
        // Barra de status
        statusLabel = new JLabel("Sistema pronto");
        statusLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        mainPanel.add(statusLabel, BorderLayout.SOUTH);
        
        setContentPane(mainPanel);
    }
    
    private void criarEvento() {
        JTextField nomeField = new JTextField();
        JTextField localField = new JTextField();
        JTextField dataField = new JTextField();
        JTextField capacidadeField = new JTextField();
        
        Object[] message = {
            "Nome:", nomeField,
            "Local:", localField,
            "Data (dd/MM/yyyy HH:mm):", dataField,
            "Capacidade:", capacidadeField
        };
        
        int option = JOptionPane.showConfirmDialog(this, message, "Novo Evento", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                String nome = nomeField.getText();
                String local = localField.getText();
                LocalDateTime data = LocalDateTime.parse(
                    dataField.getText(), 
                    DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                );
                int capacidade = Integer.parseInt(capacidadeField.getText());
                
                Evento evento = new Evento(nome, data, local, capacidade);
                eventos.add(evento);
                
                // Atualizar tabela
                eventoModel.addRow(new Object[]{
                    evento.getNome(),
                    evento.getLocal(),
                    evento.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
                    evento.getCapacidadeMaxima()
                });
                
                statusLabel.setText("Evento criado: " + evento.getNome());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Erro ao criar evento. Verifique os dados inseridos.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void criarParticipante() {
        JTextField nomeField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField cpfField = new JTextField();
        
        Object[] message = {
            "Nome:", nomeField,
            "Email:", emailField,
            "CPF:", cpfField
        };
        
        int option = JOptionPane.showConfirmDialog(this, message, "Novo Participante", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                String nome = nomeField.getText();
                String email = emailField.getText();
                String cpf = cpfField.getText();
                
                if (!Validador.validarEmail(email)) {
                    JOptionPane.showMessageDialog(this, "Email inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!Validador.validarCPF(cpf)) {
                    JOptionPane.showMessageDialog(this, "CPF inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                Participante participante = new Participante(nome, email, cpf);
                participantes.add(participante);
                
                // Atualizar tabela
                participanteModel.addRow(new Object[]{
                    participante.getNome(),
                    participante.getEmail(),
                    participante.getCpf()
                });
                
                statusLabel.setText("Participante cadastrado: " + participante.getNome());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Erro ao cadastrar participante. Verifique os dados inseridos.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            MainGUI gui = new MainGUI();
            gui.setVisible(true);
        });
    }
}
