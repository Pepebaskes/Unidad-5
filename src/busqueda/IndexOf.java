package busqueda;

import java.util.ArrayList;

public class IndexOf {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("Carlos");
        nombres.add("Enrique");

        int indice = nombres.indexOf("Jose");

        if(indice != -1){
            System.out.println(indice);
        }else{
            System.out.println("No se encuentra en la lista");
        }


    }
}
