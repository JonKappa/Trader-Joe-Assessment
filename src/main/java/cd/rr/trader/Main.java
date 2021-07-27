package cd.rr.trader;


public class Main {

    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio(0);

        portfolio.transfer(100.00);

        portfolio.transfer(120.00);

        portfolio.applyChange(5);

        portfolio.transfer(-portfolio.value);

        portfolio.applyChange(-10);

        portfolio.transfer(portfolio.Joe);

        portfolio.applyChange(5);
        portfolio.transfer(-portfolio.value);
        System.out.println(portfolio.Joe);
    }

}
