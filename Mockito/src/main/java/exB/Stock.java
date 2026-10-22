package exB;

import java.math.BigDecimal;

public class Stock {
    private String symbol;
    private String companyName;
    private BigDecimal price;

    public Stock(String symbol, String companyName, BigDecimal price) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
