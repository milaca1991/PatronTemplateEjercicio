package com.digitalhouse.backend;

public abstract class MenuVege extends ArmadoMenu {


    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public MenuVege(double precioBase, double recargo) {
        this.precioBase = precioBase;
        this.recargo = recargo;
    }

    private double precioBase;
    private double recargo;


    @Override
    protected void prepararArmado() {
        System.out.println("preparando armado menu vege");
    }

    @Override
    protected void calcularPrecio() {

        System.out.println("calculando precio menu vege");
    }
}
