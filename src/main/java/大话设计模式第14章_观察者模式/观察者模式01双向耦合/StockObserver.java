package 大话设计模式第14章_观察者模式.观察者模式01双向耦合;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:19
 * @Description:  看股票的同事类
 */
public class StockObserver {

    private String name;
    private Secretary sub;
    public StockObserver(String name ,Secretary sub){
        this.name =name;
        this.sub =sub;
    }

    public void update(){
        System.out.println(sub.getAction()+" , "+ name+"关闭股票，继续工作");
    }



}
