package 大话设计模式第14章_观察者模式.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/1/12 16:44
 * @Description: 目标对象 它知道观察他的观察者，并提供注册（添加）和删除观察者的接口
 */
public class Subject {

    //用来保存注册的观察者对象
    private List<Observer> observers =new ArrayList<>();


    /**
     *添加集合中指定观察者
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
     *通知所有的注册的观察者
     */
    protected void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
