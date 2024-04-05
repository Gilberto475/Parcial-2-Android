package com.example.parcial2;

import java.io.Serializable;

public class Producto implements Serializable {
    private int cantidadMouse;
    private int cantidadTeclado;
    private int cantidadOrdenador;
    private int cantidadTorre;

    public Producto(int cantidadMouse, int cantidadTeclado, int cantidadOrdenador, int cantidadTorre) {
        this.cantidadMouse = cantidadMouse;
        this.cantidadTeclado = cantidadTeclado;
        this.cantidadOrdenador = cantidadOrdenador;
        this.cantidadTorre = cantidadTorre;
    }

    public int getCantidadMouse() {
        return cantidadMouse;
    }

    public int getCantidadTeclado() {
        return cantidadTeclado;
    }

    public int getCantidadOrdenador() {
        return cantidadOrdenador;
    }

    public int getCantidadTorre() {
        return cantidadTorre;
    }
}
