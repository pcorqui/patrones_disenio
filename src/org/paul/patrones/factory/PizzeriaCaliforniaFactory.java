package org.paul.patrones.factory;

import org.paul.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.paul.patrones.factory.producto.PizzaCaliforniaQueso;
import org.paul.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;

         switch(tipo){
             case "queso":
                 producto = new PizzaCaliforniaQueso();
                 break;
             case "pepperoni":
                 producto = new PizzaCaliforniaPepperoni();
                 break;
             case "vegetariana":
                 producto = new PizzaCaliforniaVegetariana();
                 break;
        }
        return producto;
    }
}
