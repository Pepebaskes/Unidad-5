package ordenamientos;

import java.util.Arrays;
import java.util.Scanner;

public class BurbujaModificado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = leer.nextLine();
        }
        int vueltas = 1;
        for (int j = 0; j < nombres.length - 1; j++) {
            for (int i = 0; i < nombres.length - j - 1; i++) {
                if (nombres[i].compareToIgnoreCase(nombres[i + 1]) > 0) { //compara el string
                    String aux = nombres[i];
                    nombres[i] = nombres[i + 1];
                    nombres[i + 1] = aux;
                }
                System.out.println(vueltas + ": " + Arrays.toString(nombres));
                vueltas++;
            }
        }
    }
}
