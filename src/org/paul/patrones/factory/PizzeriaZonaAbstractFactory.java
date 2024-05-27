package org.paul.patrones.factory;


//La responsabilidad de la clase Abstracfactory no es crear el objetos pizza
//si no definir el comportamiento en comun que tienen los objetos pizza

public abstract class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("---------Fabricando la pizza " + pizza.nombre + "--------");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);
}
