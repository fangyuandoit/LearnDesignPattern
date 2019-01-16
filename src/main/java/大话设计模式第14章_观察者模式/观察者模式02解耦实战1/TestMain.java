package 大话设计模式第14章_观察者模式.观察者模式02解耦实战1;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:28
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {
        Secretary secretary =new Secretary();

        Observer stockProple= new StockObserver("tom",secretary);
        Observer nbaPeople =new NBAObserver("jhon",secretary);
        secretary.Attach(stockProple);
        secretary.Attach(nbaPeople);


        secretary.setAction("boss come back,,,");
        secretary.Notify();


    }

}
