package ex09;

public interface MecArmsService {
    //retorna 0 se nao tiver bracos disponiveis
    //ou preco unitario >0 se tiver
    public int consultar(int numeroDeBracos);
}
