package 大话设计模式第25章_中介着模式.a01同事通知;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:03
 * @Description:
 */
public class ConcreteColleague1 extends  Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message){
        mediator.Send(message,this);
    }

    public void Notify(String message){
        System.out.println("同事1得到消息"+message);
    }



}
