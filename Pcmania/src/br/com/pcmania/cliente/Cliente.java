package br.com.pcmania.cliente;

import br.com.pcmania.computador.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf, int qtdComputadores) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[qtdComputadores];
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Computador[] getComputadores() { return computadores; }
    public void setComputadores(Computador[] computadores) { this.computadores = computadores; }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Computadores adquiridos:");
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                System.out.println("Computador " + (i + 1) + ":");
                System.out.println("Marca: " + computadores[i].getMarca());
                System.out.println("Preço: R$ " + computadores[i].getPreco());
                System.out.println("--------------------");
            }
        }
    }
}
