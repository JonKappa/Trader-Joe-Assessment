package cd.rr.trader;


public class Main {

    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio(0);
        portfolio.Joe = 220;

        System.out.println("j: " + portfolio.Joe);
        portfolio.transfer(100.00);
        System.out.println("p: " + portfolio.getValue());
        portfolio.transfer(120.00);
        System.out.println("p: " + portfolio.getValue());
        portfolio.applyChange(5);
        System.out.println("p: " + portfolio.getValue());
        portfolio.transfer(-portfolio.value);
        System.out.println("p: " + portfolio.getValue());
        portfolio.applyChange(-10);
        System.out.println("p: " + portfolio.getValue());
        System.out.println("j: " + portfolio.Joe);
        portfolio.transfer(portfolio.Joe);
        System.out.println("p: " + portfolio.getValue());
        portfolio.applyChange(5);
        System.out.println("p: " + portfolio.getValue());
        portfolio.transfer(-portfolio.value);
        System.out.println("p: " + portfolio.getValue());
        System.out.println("Joe has " + portfolio.Joe + " Dollars");
    }

}
