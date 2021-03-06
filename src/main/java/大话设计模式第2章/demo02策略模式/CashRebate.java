package 大话设计模式第2章.demo02策略模式;

public class CashRebate extends CashSuper {

    private double moneyRebate =0d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
