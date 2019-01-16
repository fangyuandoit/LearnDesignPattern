package 大话设计模式第14章_观察者模式.观察者模式02解耦实战2;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:57
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        Subject boss =new Boss();

        Observer stockObserver =new StockObserver("jack",boss);

        boss.Attach(stockObserver);

        boss.setAction("i am boss");
        boss.Notify();

    }

}
