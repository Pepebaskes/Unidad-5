package ordenamientos;

import java.awt.font.FontRenderContext;
import java.util.Arrays;

public class Burbuja {

    public static void main(String[] args) {
        int numero [] = {45,17,23,67,21}; //arreglo que vamos a ordnear
        int vueltas =1;

        for(int j = 0; j< numero.length-1;j++) { //en este for, le decimos que se repita 4 veces, porque son 5 numeros, 4 comparaciones
            for (int i = 0; i < numero.length -j-1; i++) { //aui lo mismo, solo que representa el numero en el arreglo para hacer el cmabio
                if (numero[i] > numero[i + 1]) { //comparamos
                    int aux = numero[i];
                    numero[i] = numero[i + 1];
                    numero[i + 1] = aux;
                }
                System.out.println(vueltas + ": " + Arrays.toString(numero));
                vueltas++;
            }
        }


    }
}
