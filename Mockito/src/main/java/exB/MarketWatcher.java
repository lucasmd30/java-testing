package exB;

// Conecta na Internet para buscar as cotações atuais.
// Nos testes essa funcionalidade não está disponível: use um mock.
public class MarketWatcher {

    public Stock getQuote(String symbol) {
        throw new UnsupportedOperationException("sem conexão com a Internet");
    }
}
