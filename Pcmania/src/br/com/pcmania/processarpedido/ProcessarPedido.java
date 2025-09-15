package br.com.pcmania.processarpedido;

import br.com.pcmania.computador.Computador;

public class ProcessarPedido {

    public static void enviarPedido(Computador[] computadores) {
        System.out.println("Pedido enviado...");
        System.out.println("Resumo do pedido:");

        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                System.out.println("Computador " + (i + 1) + ":");
                System.out.println("Marca: " + computadores[i].getMarca());
                System.out.println("Preço: R$ " + computadores[i].getPreco());
                total += computadores[i].getPreco();
                System.out.println("--------------------");
            }
        }
        System.out.println("Total da compra: R$ " + total);
    }
}
