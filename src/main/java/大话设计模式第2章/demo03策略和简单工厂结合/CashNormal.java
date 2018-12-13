package 大话设计模式第2章.demo03策略和简单工厂结合;

//正常收费类
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
