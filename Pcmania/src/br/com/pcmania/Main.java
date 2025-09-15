package br.com.pcmania;

import br.com.pcmania.cliente.Cliente;
import br.com.pcmania.computador.Computador;
import br.com.pcmania.computador.HardwareBasico;
import br.com.pcmania.computador.SistemaOperacional;
import br.com.pcmania.processarpedido.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ajuste aqui sua matrícula
        int matricula = 1234;

        Cliente cliente = new Cliente("João da Silva", "123.456.789-00", 20);

        Computador[] carrinho = new Computador[20];
        int qtd = 0;

        while (true) {
            System.out.println("===== PC Mania =====");
            System.out.println("1 - Promoção Apple (R$ " + matricula + ")");
            System.out.println("2 - Promoção Samsung (R$ " + (matricula + 1234) + ")");
            System.out.println("3 - Promoção Dell (R$ " + (matricula + 5678) + ")");
            System.out.println("0 - Finalizar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            if (op == 0) break;

            Computador pc = new Computador();

            switch (op) {
                case 1:
                    pc.setMarca("Apple");
                    pc.setPreco(matricula);
                    pc.setHardware(new HardwareBasico("Pentium Core i3", 2200));
                    pc.setSistema(new SistemaOperacional("macOS Sequoia", 64));
                    break;
                case 2:
                    pc.setMarca("Samsung");
                    pc.setPreco(matricula + 1234);
                    pc.setHardware(new HardwareBasico("Pentium Core i5", 3370));
                    pc.setSistema(new SistemaOperacional("Windows 8", 64));
                    break;
                case 3:
                    pc.setMarca("Dell");
                    pc.setPreco(matricula + 5678);
                    pc.setHardware(new HardwareBasico("Pentium Core i7", 4500));
                    pc.setSistema(new SistemaOperacional("Windows 10", 64));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            carrinho[qtd++] = pc;
            System.out.println("Adicionado ao carrinho.\n");
        }

        Computador[] compra = new Computador[qtd];
        for (int i = 0; i < qtd; i++) compra[i] = carrinho[i];

        cliente.setComputadores(compra);
        cliente.mostrarCliente();
        ProcessarPedido.enviarPedido(cliente.getComputadores());

        sc.close();
    }
}
