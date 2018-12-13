package 大话设计模式第2章.demo02策略模式;

//正常收费类
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
