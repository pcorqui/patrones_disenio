package org.paul.patrones.factory;

import java.util.ArrayList;
import java.util.List;

//El producto no es una clase concreta
//si no que define los metodos en comun
//entre todas las clases que lo implementa
//teniendo asi una familia de productos con funcionalidades en comun
public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto(){
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("agregando salsa " + salsa);
        System.out.println("agregando los ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    public abstract void cocinar();
    public abstract void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en la caja de empaque");
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
