package com.ironhack;

public class Coche extends Vehiculo{
    
    private boolean airConditioning;
    private boolean cristalesTintados;

    public Coche(String brand, String model, boolean airConditioning, boolean cristalesTintados) {
        super(brand, model);
        this.airConditioning = airConditioning;
        this.cristalesTintados = cristalesTintados;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public boolean isCristalesTintados() {
        return cristalesTintados;
    }

    public void setCristalesTintados(boolean cristalesTintados) {
        this.cristalesTintados = cristalesTintados;
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }
l

}
