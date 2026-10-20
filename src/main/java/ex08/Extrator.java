package ex08;

import java.util.ArrayList;
import java.util.List;

public class Extrator {

    public List<Dados> extrair(List<Pessoa> pessoas) {
        if (pessoas == null)
            throw new RuntimeException("lista nula");

        if (pessoas.size() == 0)
            throw new IllegalArgumentException("lista vazia");

        for (var p : pessoas) {
            var nome = p.getNome();
            if (nome.contains("$") || nome.contains("%"))
                throw new IllegalArgumentException("nome com caracter invalido");

            if (p.getNome().trim().equals(""))
                throw new IllegalArgumentException("nome em branco");
        }

        var ret = new ArrayList<Dados>();
        pessoas.forEach(p -> {
            int numNomes = p.getNome().split(" ").length;
            ret.add(new Dados(numNomes, 2021 - p.getAnoNascimento()));
        });

        return ret;
    }
}
