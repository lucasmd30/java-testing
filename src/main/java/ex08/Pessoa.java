package ex08;

public class Pessoa {
    String nome;
    int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.anoNascimento = anoNascimento;
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getNome() {
        return nome;
    }
}
