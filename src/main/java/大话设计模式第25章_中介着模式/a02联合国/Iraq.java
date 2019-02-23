package 大话设计模式第25章_中介着模式.a02联合国;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:37
 * @Description: 伊拉克
 */
public class Iraq extends  Country{
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void Declare(String message){
        mediator.Declare(message,this);
    }

    public void GetMessage(String message){
        System.out.println("Iraq get message--" + message);
    }

}
