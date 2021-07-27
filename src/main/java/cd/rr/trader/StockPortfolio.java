package cd.rr.trader;

public class StockPortfolio {
    double value;
    static int transferFee = 10;

    StockPortfolio(double value){
        this.value = value;
    }


    double Joe;
    public double getValue() {
        return value;
    }

    void transfer(double amount) {
        if (amount > 0) {
            Joe -= amount;
            value = value + amount;
            value -= transferFee;
        }
        else if (amount < 0) {
            Joe = value - 10;
            value = value + amount;
        }
    }

    void applyChange(double percentage) {
        percentage = (percentage + 100) /100;
        value = value * percentage;
    }
}
