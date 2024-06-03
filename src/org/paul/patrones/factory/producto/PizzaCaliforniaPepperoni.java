package org.paul.patrones.factory.producto;

import org.paul.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra queso mozzarela");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min.a 55C.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequenios rectangulos");
    }
}
