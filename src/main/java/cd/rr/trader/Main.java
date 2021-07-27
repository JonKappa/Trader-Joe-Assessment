package cd.rr.trader;


public class Main {

    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio(0);

        portfolio.transfer(100.00);
        System.out.println(portfolio.getValue());
        portfolio.transfer(120.00);
        System.out.println(portfolio.getValue());
        portfolio.applyChange(5);
        System.out.println(portfolio.getValue());
        portfolio.transfer(-portfolio.value);
        System.out.println(portfolio.getValue());
        portfolio.applyChange(-10);
        System.out.println(portfolio.getValue());
        portfolio.transfer(portfolio.Joe);
        System.out.println(portfolio.getValue());
        portfolio.applyChange(5);
        System.out.println(portfolio.getValue());
        portfolio.transfer(-portfolio.value);
        System.out.println(portfolio.getValue());
        System.out.println("Joe has " + portfolio.Joe + " Dollars");
    }

}
