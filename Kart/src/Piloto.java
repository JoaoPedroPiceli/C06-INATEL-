public class Piloto {
    String nome;
    boolean vilao;

    void soltaSuperPoder() {
        if (vilao) {
            System.out.println(nome + " (vilão) soltou um super poder maligno!");
        } else {
            System.out.println(nome + " soltou um super poder!");
        }
    }
}
