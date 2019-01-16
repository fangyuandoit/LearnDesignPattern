package 大话设计模式第14章_观察者模式.观察者模式02解耦实战2;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:57
 * @Description:
 */
public class StockObserver extends  Observer {

    private String name;
    private Subject sub;
    public StockObserver(String name ,Subject sub){
        this.name =name;
        this.sub =sub;
    }

    @Override
    public void update() {
        System.out.println(sub.getAction()+name + "关闭股票，继续工作");
    }
}
