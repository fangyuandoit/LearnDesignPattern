package 大话设计模式第20章_迭代器模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/16 23:15
 * @Description:  迭代器抽象类
 * 用于定义得到开始对象，得到下一个对象，判断是否到尾，当前对象等抽象方法，接口
 */
public  abstract class Iterator {

    public abstract  Object First();
    public abstract  Object Next();
    public abstract  boolean IsDone();
    public abstract  Object CurrentItem();


}
