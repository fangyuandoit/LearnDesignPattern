package 大话设计模式第14章_观察者模式.观察者模式02解耦实战1;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:20
 * @Description:
 */
public class StockObserver extends  Observer {

    private String name;
    private Secretary sub;
    public StockObserver(String name ,Secretary sub){
        this.name =name;
        this.sub =sub;
    }

    @Override
    public void update() {
        System.out.println(sub.getAction()+name + "关闭股票，继续工作");
    }
}
