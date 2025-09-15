package br.com.pcmania.computador;

public class Memoria {
    private String nome;
    private float capacidade;

    public Memoria(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() { return nome; }
    public float getCapacidade() { return capacidade; }

}
