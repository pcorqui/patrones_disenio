package org.paul.patrones.singleton;

public class ConexionDBSingleton {

    private static ConexionDBSingleton instancia;
    private ConexionDBSingleton(){
        System.out.println("Conectandose a algun motor de base de datos");
    }

    public static ConexionDBSingleton getInstancia(){
        if (instancia == null){
            instancia = new ConexionDBSingleton();
        }
        return instancia;
    }
}
