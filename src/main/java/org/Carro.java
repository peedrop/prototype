package org;

public class Carro implements Cloneable{

    private String marca;
    private String modelo;
    private int numPortass;
    private int velocidadeMax;
    public Carro(String marca, String modelo, int numPortass, int velocidadeMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPortass = numPortass;
        this.velocidadeMax = velocidadeMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPortass() {
        return numPortass;
    }

    public void setNumPortass(int numPortass) {
        this.numPortass = numPortass;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", numero de portas=" + numPortass +
                ", velocidade maxima='" + velocidadeMax + '\'' +
                '}';
    }
}
