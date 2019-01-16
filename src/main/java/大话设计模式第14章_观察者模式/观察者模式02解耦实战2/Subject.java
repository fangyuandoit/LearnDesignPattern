package 大话设计模式第14章_观察者模式.观察者模式02解耦实战2;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:49
 * @Description:  抽象通知着接口
 */
@Data
public abstract class Subject {

    abstract void Attach(Observer observer);
    abstract void Detach(Observer observer);
    abstract void Notify();
    String action;


}
