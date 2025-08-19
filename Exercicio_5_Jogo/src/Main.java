public class Main {
    public static void main(String[] args) {

        Personagem  personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        Arma ar1 = new Arma();
        Arma ar2 = new Arma();

        ar1.nome = "AK47";
        ar1.poder = 20;
        ar1.resistencia = 30;
        ar1.descricao = "Uma arma rapida, que nao trava muito eficaz";

        ar2.nome = "M4";
        ar2.poder = 10;
        ar2.resistencia = 20;
        ar2.descricao = "Arma boa e agil de ultima geracao";

    personagem1.nome = "Rodrigo";
    personagem1.pontos = 100;
    personagem1.arma = ar1;

    personagem2.nome = "Pedro";
    personagem2.pontos = 100;
    personagem2.arma = ar2;


    personagem1.usarArma();
    personagem2.usarArma();
    personagem1.tomarDano();
    personagem2.tomarDano();
    ar1.mostraInformacaoArma();
    ar2.mostraInformacaoArma();

    }
    }
