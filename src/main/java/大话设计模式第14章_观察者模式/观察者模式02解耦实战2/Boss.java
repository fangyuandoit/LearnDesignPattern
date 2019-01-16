package 大话设计模式第14章_观察者模式.观察者模式02解耦实战2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:52
 * @Description:  通知着 老板
 */
@Data
public class Boss extends   Subject {

    private List<Observer> observers =new ArrayList<>();
    private String action;

    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
         for(Observer o : observers){
              o.update();
         }
    }
}
