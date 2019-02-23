package 大话设计模式第25章_中介着模式.a01同事通知;

/**
 * @Author: fang
 * @Date: 2019/2/23 21:55
 * @Description:抽象中介着类
 */
public  abstract  class Mediator {

    //定义一个抽象的发送消息的方法，得到同事对象喝发送消息。
    public  abstract  void Send(String message ,Colleague colleague);

}
