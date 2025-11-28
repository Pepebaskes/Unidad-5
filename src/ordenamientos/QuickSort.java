package ordenamientos;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = leer.nextLine();
        }
        quickSort(nombres, 0, nombres.length - 1);
        System.out.println(Arrays.toString(nombres));
    }
    //quicksort
    public static void quickSort(String[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arr, inicio, fin);
            quickSort(arr, inicio, indicePivote - 1);
            quickSort(arr, indicePivote + 1, fin);
        }
    }
    // acomodo de los numeros
    public static int particion(String[] arr, int inicio, int fin) {
        String uFPivote = arr[fin];
        int posIntercambio = inicio - 1;

        for (int i = inicio; i < fin; i++) {
            if (arr[i].compareToIgnoreCase(uFPivote) <= 0) {
                posIntercambio++;

                String aux = arr[posIntercambio]; //intercambios los numeros
                arr[posIntercambio] = arr[i];
                arr[i] = aux;
            }
        }
        //Acomodo del pivote en medio, con los intercambios correspondiente
        String aux = arr[posIntercambio + 1];
        arr[posIntercambio + 1] = arr[fin];
        arr[fin] = aux;
        return posIntercambio + 1;
    }
}
