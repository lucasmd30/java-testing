package ex01;

public class Mutante2 {

    //método retorna o maior elemento do vetor
    public int getMaior(int vetor[]) {
        int maior = vetor[0];
        for (int i = 2; i < vetor.length; i++) { // '1' -> '2'
            if (vetor[i] > maior)
                maior = vetor[i];
        }
        return maior;
    }
}
