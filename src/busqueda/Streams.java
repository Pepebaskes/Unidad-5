package busqueda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlitos");
        nombres.add("Arnold");
        nombres.add("Amanda");
        nombres.add("America");
        nombres.add("Diego maradonio");

        List<String> resultado = nombres.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(resultado);

    }
}
