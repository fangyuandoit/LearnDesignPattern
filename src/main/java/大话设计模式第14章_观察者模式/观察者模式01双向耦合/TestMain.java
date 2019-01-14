package 大话设计模式第14章_观察者模式.观察者模式01双向耦合;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:40
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        // 前台通知着
        Secretary tongzizhe =new Secretary();

        StockObserver tongshi1  =new StockObserver("张三",tongzizhe);
        StockObserver tongshi2  =new StockObserver("李四",tongzizhe);

        //前台记下同事
        tongzizhe.Attach(tongshi1);
        tongzizhe.Attach(tongshi2);

        //发现老板回来
        tongzizhe.setAction("老板回来了");

        //通知同事
        tongzizhe.Notify();

    }

}
