package org.paul.patrones.factory.ejemplo;

import org.paul.patrones.factory.PizzaProducto;
import org.paul.patrones.factory.PizzeriaCaliforniaFactory;
import org.paul.patrones.factory.PizzeriaNewYorkFactory;
import org.paul.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();

        System.out.println("California pizza");
        PizzaProducto pizza = ca.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.toString());

        pizza = ca.ordenarPizza("pepperoni");
        System.out.println("mari ordena la pizza " + pizza.toString());

        System.out.println("New York pizza");
        pizza = ny.ordenarPizza("italiana");
        System.out.println("Juan ordena la pizza " + pizza.toString());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Juana ordena la pizza " + pizza.toString());

    }
}
