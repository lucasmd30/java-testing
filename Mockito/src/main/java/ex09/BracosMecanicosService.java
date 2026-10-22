package ex09;

public interface BracosMecanicosService {
    //retorna 0 se nao tiver bracos dispoveis
    //ou preco unitario >0 se tiver
    public int requisitar(int numeroDeBracosMecanicos);
}
