package ex02;

public class Mutante3 {

    public int contarA(String word) {
        int contador = 0;
        for (int i = 0; i < word.length() - 1; i++) { // 'word.length()' -> 'word.length() - 1'
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A')
                contador++;
        }
        return contador;
    }
}
