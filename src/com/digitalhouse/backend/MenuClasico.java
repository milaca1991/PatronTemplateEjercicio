package com.digitalhouse.backend;

public abstract class MenuClasico extends ArmadoMenu{


    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public  MenuClasico(Double precioBase) {
        this.precioBase = precioBase;
    }

    private Double precioBase;


    @Override
    protected void prepararArmado() {

        System.out.println("preparando armado menu clasico");
    }



    @Override
    protected void calcularPrecio() {
        System.out.println("calculando precio menu clasico");


    }


}
