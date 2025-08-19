public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor(); // cada Kart já começa com um motor
    }

    void pular() {
        System.out.println(nome + " pulou!");
    }

    void soltarTurbo() {
        System.out.println(nome + " soltou o turbo!");
    }

    void fazerDrift() {
        System.out.println(nome + " fez um drift!");
    }
}
