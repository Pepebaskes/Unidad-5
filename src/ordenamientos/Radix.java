package ordenamientos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que permite ordenar los valores por sus columnas
 * @author pepe
 */
public class Radix {

    /**
     * crear un acumulado de las posiciones
     * crear un arreglo acomulado por el orden
     * crear un arreglo nuevo ordenado
     * @param numeros
     * @param exp
     */
    private static void ordenarPorColumna(int[] numeros,int exp) {
        int cant = numeros.length;
        int[] ordenado = new int[cant];
        int[] posiciones = new int[10];
        // crear un acumulado de las posiciones
        for (int i = 0; i < cant; i++) {
            int digito = (numeros[i] / exp) % 10;
            posiciones[digito]++;
        }
        //crear un arreglo acomulado por el orden
        for (int i = 1; i < 10; i++) {
            posiciones[i] += posiciones[i - 1];
        }
        // crear un arreglo nuevo ordenado
        for (int i = cant - 1; i >= 0; i--) {
            int digito = (numeros[i] / exp) % 10;
            int posicionFinal = posiciones[digito] - 1;
            ordenado[posicionFinal] = numeros[i];
            posiciones[digito]--;
        }
        System.arraycopy(ordenado, 0, numeros, 0, cant);
    }

    /**
     * max trae el valor maximo de la coleccion de valores
     * orElseThrow
     * Stream es para decirle con cual conjunto de valores va a trabajar.
     * @param numeros
     */
    private static void radixSort(int[] numeros){
        /// obtener el valor mayor del arreglo
        int max = Arrays.stream(numeros).max().orElseThrow();
        //System.out.println("El numero mayor es " + max);
        for (int exp = 1; (max / exp) > 0 ; exp*=10) {
            ordenarPorColumna(numeros, exp);

        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Algoritmo radix");
        System.out.println("Ingrese la cantidad de numeros que quiere ingresar: ");
        int cantidadNumeros = leer.nextInt();
        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
        }
        radixSort(numeros);
        System.out.println(Arrays.toString(numeros));

    }
}