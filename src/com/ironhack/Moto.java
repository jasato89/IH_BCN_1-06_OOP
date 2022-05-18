package com.ironhack;

public class Moto  extends Vehiculo{
    
    private boolean manillarDeAcero;
    private int numeroRuedas;

    public Moto(String brand, String model, boolean manillarDeAcero, int numeroRuedas) {
        super(brand, model);
        this.manillarDeAcero = manillarDeAcero;
        this.numeroRuedas = numeroRuedas;
    }

    public boolean isManillarDeAcero() {
        return manillarDeAcero;
    }

    public void setManillarDeAcero(boolean manillarDeAcero) {
        this.manillarDeAcero = manillarDeAcero;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
    
    
}
