package br.com.pcmania.computador;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico hardware;
    private Memoria memoria;
    private SistemaOperacional sistema;

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco; }

    public void setHardware(HardwareBasico hardware) { this.hardware = hardware; }
    public void setSistema(SistemaOperacional sistema) { this.sistema = sistema; }

    public HardwareBasico getHardware() { return hardware; }
    public SistemaOperacional getSistema() { return sistema; }

    public Memoria getMemoria() { return memoria; }
    public void setMemoria(Memoria memoria) { this.memoria = memoria; }
}
