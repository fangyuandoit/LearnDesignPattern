package 大话设计模式第14章_观察者模式.观察者模式02解耦实战2;

/**
 * @Author: fang
 * @Date: 2019/1/16 22:49
 * @Description:
 */
public  abstract  class Observer {

    private String name;
    private Secretary secretary;

    public abstract  void update();


}
