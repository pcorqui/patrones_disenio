import org.paul.patrones.singleton.ConexionDBSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i<10; i++){
            ConexionDBSingleton con = ConexionDBSingleton.getInstancia();
            System.out.println("con = " + con);
        }

        ConexionDBSingleton con2 = ConexionDBSingleton.getInstancia();
        ConexionDBSingleton con3 = ConexionDBSingleton.getInstancia();

        if(con3 == con2){
            System.out.println("The same");
        }

    }
}