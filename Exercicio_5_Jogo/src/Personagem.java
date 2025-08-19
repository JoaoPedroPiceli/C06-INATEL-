public class Personagem {

    String nome;
    int pontos;
    Arma arma;

    void usarArma(){
        arma.resistencia -= 2;
        System.out.println("Resistencia: " + arma.resistencia);
    }

    void tomarDano()
    {
        pontos -= 5;
        System.out.println("Pontos" + pontos);
    }

}
