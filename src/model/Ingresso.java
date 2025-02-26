package model;

import java.io.Serializable;

public class Ingresso implements Serializable {
    private String codigo;
    private double valor;

    public Ingresso(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso: Código " + codigo + ", Valor: R$" + valor;
    }

    // Getters e setters
}
