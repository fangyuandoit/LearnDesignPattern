package 大话设计模式第14章_观察者模式.观察者模式01双向耦合;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:17
 * @Description:  秘书类，发现老板 通知同事
 */
@Data
public class Secretary {

    //同事列表
    private List<StockObserver> observers =new ArrayList();
    private String action;

    //增加
    public void Attach(StockObserver observer){
        observers.add(observer);
    }

    //通知
    public void Notify(){

        for(StockObserver o :observers){
            o.update();
        }

    }


}
