package 大话设计模式第14章_观察者模式.demo02Weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:10
 * @Description:
 */
public class WeatherSubject {

    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //attach detach notifyObserver
    /**
     *订阅天气的人添加到列表中
     */
    public void attach(Observer observer){
        observers.add(observer);
    }
    /**
     *删除集合中指定观察者
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }
    /**
     *通知所有的订阅的天气的人，观察者
     */
    protected void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
