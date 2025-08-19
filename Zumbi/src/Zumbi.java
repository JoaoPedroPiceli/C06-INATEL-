public class Zumbi {
    double vida;
    String nome;

    void seAlimentar(){
        System.out.println("Zumbi se alimentando..." + nome);
    }

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}
