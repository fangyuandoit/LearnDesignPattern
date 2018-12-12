package 大话设计模式第2章.简单工厂商品打折;


/**
 * 现金收取超类
 *
 */
public abstract class CashSuper {

    /**
     * @param money 参数为原价
     * @return  返回为当前价格
     */
    public  abstract double acceptCash(double money);

}
