package ex01;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PessoaDAOTest {
    private RHService rhService;
    private PessoaDAO pessoaDao;

    @BeforeEach
    void setUp(){
        rhService = mock(RHService.class);
        pessoaDao = new PessoaDAO(rhService);
    }

    @Test
    void pessoaExiste() {
        Pessoa lucas = new Pessoa();
        lucas.setNome("Lucas");

        ArrayList<Pessoa> pessoasDoRH = new ArrayList<>();
        pessoasDoRH.add(lucas);

        when(rhService.getAllPessoas()).thenReturn(pessoasDoRH);

        boolean resultado = pessoaDao.existePessoa("Lucas");
        assertEquals(true,resultado);
    }

    @Test
    void pessoaNaoExiste(){
        Pessoa lucas = new Pessoa();
        lucas.setNome("Lucas");

        ArrayList<Pessoa> pessoasDoRh = new ArrayList<>();
        pessoasDoRh.add(lucas);

        when(rhService.getAllPessoas()).thenReturn(pessoasDoRh);

        boolean resultado = pessoaDao.existePessoa("Ana");
        assertEquals(false, resultado);
    }



}
