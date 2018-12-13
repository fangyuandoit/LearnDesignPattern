package 大话设计模式第2章.demo02策略模式;

public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
