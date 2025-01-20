package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<String> streamDeString = Stream.of("Ramiro","Carlos","Peñarol","Javier","Sasuke")
                .map(s -> s.replace("Peñarol","Uzumaki"))
                .map(s -> s.toLowerCase())
                .filter(s -> s.contains("u"));

        List<String> lista = streamDeString.collect(Collectors.toList());

        System.out.println(lista);

        long stream2 = Stream.of("akatsuki","sikamaru","choji")
                .count();

        boolean stream3 = Stream.of("akatsuki","sikamaru","choji")
                .anyMatch(s -> s.contains("z"));

        System.out.println(stream2);
        System.out.println(stream3);
    }
}
