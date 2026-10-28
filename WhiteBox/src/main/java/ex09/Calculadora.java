package ex09;

public class Calculadora {

    /**
     * @param n - inteiro
     * @param valorMaximo - valor maximo que pode ter o somatorio
     * @return - o somatorio de 0 ate |n|, caso somatorio seja <= valorMaximo
     * @throws Exception - caso o somatorio seja > valorMaximo
     */
    public int somatoriaLimitada(int n, int valorMaximo) throws Exception {
        int resultado = 0, i = 0;
        if (n < 0) {
            n = -n;
        }
        while (i <= n && resultado <= valorMaximo) {
            resultado = resultado + i;
            i++;
        }
        if (resultado > valorMaximo)
            throw new Exception("valor maximo foi ultrapassado");
        else
            return resultado;
    }
}
