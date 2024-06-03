package org.paul.patrones.factory.producto;

import org.paul.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegerariana";
        masa = "Masa delgada Light";
        salsa = "Salsa BBQ light";
        ingredientes.add("Aceitunas");
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Concinando por 20 min. a 180C.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
