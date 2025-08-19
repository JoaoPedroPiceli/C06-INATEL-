public class Main {

    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.nome = "Regular";
        zumbi.vida = 100;

        zumbi2.nome = "Ex";
        zumbi2.vida = 200;

        zumbi.seAlimentar();
        zumbi2.seAlimentar();

        System.out.println(zumbi.mostraVida());
        System.out.println(zumbi2.mostraVida());

        zumbi2.transfereVida(zumbi,40);
        System.out.println(zumbi2.nome + " Danificou " + zumbi.nome  );
        System.out.println(zumbi.mostraVida());
        System.out.println(zumbi2.mostraVida());

    }
}
