package org.paul.patrones.factory.producto;

import org.paul.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni(){
        super();
        nombre = "Pizza Peperoni New York";
        masa = "Masa Delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra peperoni");
        ingredientes.add("aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
