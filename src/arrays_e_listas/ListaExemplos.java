package arrays_e_listas;

import java.util.ArrayList;
import java.util.List;

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

    }
}
