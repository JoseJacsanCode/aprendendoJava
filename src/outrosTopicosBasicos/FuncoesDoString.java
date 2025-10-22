package outrosTopicosBasicos;

public class FuncoesDoString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase(); //Todas as letras minúsculas
        String s02 = original.toUpperCase(); //Todas as letras maiúsculas
        String s03 = original.trim(); //Mantém a String original, mas elimina espaços em branco
        String s04 = original.substring(2); //Imprime a partir da posição designada
        String s05 = original.substring(2, 9); //Imprime a partir da posição e limite designados
        String s06 = original.replace('a', 'x'); //Troca o primeiro elemento pelo segundo elemento presente na String
        String s07 = original.replace("abc", "xde"); //Usando replace com substring
        int i = original.indexOf("bc"); //Define a partir de que ponto começa o conteúdo entre parênteses
        int j = original.lastIndexOf("bc"); //Define a partir de que ponto termina o conteúdo entre parênteses

        System.out.println("Original: -" + original + " -");
        System.out.println("toLowerCase: -" + s01 + " -");
        System.out.println("toUpperCase: " + s02);
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x') - " + s06 + "-");
        System.out.println("replace('a', 'x') - " + s07 + "-");
        System.out.println("indexOf: -" + i + "-");
        System.out.println("lastIndexOf -"+ j + "-");

    }
}
