package model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
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
        for (Participante p : participantes) {
            if (p.equals(participante)) {
                return false; // Participante já existente e não ppode repitir
            }
        }
        participantes.add(participante);
        return true;
    }

    // Outros métodos...
}
