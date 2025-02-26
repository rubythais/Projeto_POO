package model;

import java.io.Serializable;

public class Participante implements Serializable {
    private String nome;
    private String email;
    private String cpf;

    public Participante(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participante that = (Participante) obj;
        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }

    @Override
    public String toString() {
        return "Participante: " + nome + ", Email: " + email + ", CPF: " + cpf;
    }

    // Getters e setters
}
