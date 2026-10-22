package ex07;

public class Aluno {

    private String nome;
    private float nota;
    private String mensagem;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public float getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}
