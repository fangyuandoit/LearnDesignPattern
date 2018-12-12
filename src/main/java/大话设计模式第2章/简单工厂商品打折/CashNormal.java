package 大话设计模式第2章.简单工厂商品打折;

//正常收费类
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
