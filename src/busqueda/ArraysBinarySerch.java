package busqueda;

import java.util.Arrays;

public class ArraysBinarySerch {

    public static void main(String[] args) {
        int[] numeros = {2,5,43,12,5,78,4,3423};

        Arrays.sort(numeros);
        int index = Arrays.binarySearch(numeros,6);
        if(index >= 0){
            System.out.println("Está en el indice: "+index);
        } else{
            System.out.println("No se encuentra");
        }

    }
}
