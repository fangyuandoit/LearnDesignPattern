package 大话设计模式第14章_观察者模式.观察者模式02解耦实战1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:19
 * @Description:
 */
@Data
public class Secretary {

    private String action;
    private List<Observer> observers =new ArrayList<>();

    //add
    public void Attach(Observer observer){
         observers.add(observer);
    }

    //notify
    public void Notify(){
        for(Observer o : observers){
            o.update();
        }
    }


}
