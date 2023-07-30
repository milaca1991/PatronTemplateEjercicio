package com.digitalhouse.backend;

public abstract class ArmadoMenu {


    public void prepararMenu() {
        prepararArmado();
        calcularPrecio();
        adicionarEspecias();
        adicionarJuguete();
        adicionarSalsa();
    }

    protected abstract void prepararArmado();

    protected abstract void calcularPrecio();

    private void adicionarJuguete() {
        System.out.println("adicionando juguete...");
    }

    private void adicionarSalsa() {
        System.out.println("adicionando salsa...");
    }

    private void adicionarEspecias() {
        System.out.println("adicionando especias...");
    }


}
