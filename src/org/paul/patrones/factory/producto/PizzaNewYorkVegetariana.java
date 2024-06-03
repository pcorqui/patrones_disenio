package org.paul.patrones.factory.producto;

import org.paul.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana(){
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Tomate");
        ingredientes.add("Queso vegano");
        ingredientes.add("aceitunas");
        ingredientes.add("espinacas");
        ingredientes.add("Berenjenas");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
