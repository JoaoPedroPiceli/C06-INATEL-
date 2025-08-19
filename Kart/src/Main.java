public class Main {
    public static void main(String[] args) {

        // Criando Piloto 1
        Piloto p1 = new Piloto();
        p1.nome = "Mario";
        p1.vilao = false;

        // Criando Piloto 2
        Piloto p2 = new Piloto();
        p2.nome = "Bowser";
        p2.vilao = true;

        // Criando Kart 1
        Kart k1 = new Kart();
        k1.nome = "Kart Vermelho";
        k1.piloto = p1;
        k1.motor.cilindrada = "100cc";
        k1.motor.velocidadeMaxima = (float)120;

        // Criando Kart 2
        Kart k2 = new Kart();
        k2.nome = "Kart Monstro";
        k2.piloto = p2;
        k2.motor.cilindrada = "150cc";
        k2.motor.velocidadeMaxima = (float)150;

        // Testando ações Kart 1
        k1.pular();
        k1.soltarTurbo();
        k1.fazerDrift();
        k1.motor.mostraInfo();
        k1.piloto.soltaSuperPoder();

        System.out.println();

        // Testando ações Kart 2
        k2.pular();
        k2.soltarTurbo();
        k2.fazerDrift();
        k2.motor.mostraInfo();
        k2.piloto.soltaSuperPoder();
    }
}
