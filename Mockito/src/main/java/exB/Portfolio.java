package exB;

import java.math.BigDecimal;

// Lê e grava as informações em um banco de dados.
// Nos testes essa funcionalidade não está disponível: use um mock.
public class Portfolio {

    public BigDecimal getAvgPrice(Stock stock) {
        throw new UnsupportedOperationException("sem conexão com o BD");
    }

    public void sell(Stock stock, int quantity) {
        throw new UnsupportedOperationException("sem conexão com o BD");
    }

    public void buy(Stock stock) {
        throw new UnsupportedOperationException("sem conexão com o BD");
    }
}
