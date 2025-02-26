package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Evento implements Serializable {
    private String nome;
    private String data;
    private String local;
    private List<Participante> participantes;

    public Evento(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    public boolean adicionarParticipante(Participante participante) {
        if (!participantes.contains(participante)) {
            participantes.add(participante);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Evento: " + nome + ", Data: " + data + ", Local: " + local;
    }

    // Getters e setters
}
