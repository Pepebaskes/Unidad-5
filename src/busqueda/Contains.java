package busqueda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contains {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Chayito");
        nombres.add("Rosa Melano");
        nombres.add("Diego Maradonio");
        nombres.add("Carlitos");

        boolean siEsta = nombres.contains("Tommy");
        if(siEsta){
            System.out.println("Si existe");
        } else{
            System.out.println("No existe");
        }

    }
}
