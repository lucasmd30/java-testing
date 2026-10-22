package ex09;

public interface ANDBaseService {
    //se disponivel, retorna o preco por base movel do robo
    //caso contrario, retorna -1
    int verificarDisponibilidade(int numeroDeBases);
}
