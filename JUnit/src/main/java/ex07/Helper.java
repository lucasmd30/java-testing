package ex07;

import java.util.ArrayList;

public class Helper {

    public ArrayList<Aluno> gerarMensagens(ArrayList<Aluno> alunos) throws Exception {
        if (alunos == null)
            throw new RuntimeException("lista nula");

        if (alunos.isEmpty())
            throw new Exception("lista vazia de alunos");

        for (var e : alunos) {
            if (e.getNome().trim().equals(""))
                throw new Exception("algum nome invalido");

            if (e.getNota() < 0 || e.getNota() > 10)
                throw new Exception("alguma nota invalida");
        }

        alunos.forEach(e -> {
            if (e.getNota() >= 8.5)
                e.setMensagem("excelente");
            else if (e.getNota() >= 6.5)
                e.setMensagem("bom");
            else if (e.getNota() >= 5.0)
                e.setMensagem("regular");
            else
                e.setMensagem("reprovado");
        });

        return alunos;
    }
}
