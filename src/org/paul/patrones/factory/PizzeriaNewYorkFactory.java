package org.paul.patrones.factory;

import org.paul.patrones.factory.producto.PizzaNewYorkItaliana;
import org.paul.patrones.factory.producto.PizzaNewYorkPeperoni;
import org.paul.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPeperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;

        }
        return producto;
    }
}
