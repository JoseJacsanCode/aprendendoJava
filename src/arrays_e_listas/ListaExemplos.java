package arrays_e_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaExemplos {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria"); // Adicionando elementos
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // Adiciona elementos a determinadas posições

        System.out.println(list.size()); // size() imprime o tamanho da lista
        for(String elements : list) {
            System.out.println(elements);
        }

        list.remove("Anna"); //Compara e remove o elemento entre parênteses
        System.out.println("---------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); // Remove por predicado
        for(String elements : list) {
            System.out.println(elements);
        }

        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Acha o índice do elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null) ;
        System.out.println(name);
        
    }
}
