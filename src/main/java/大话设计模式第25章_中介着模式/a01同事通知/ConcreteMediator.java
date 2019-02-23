package 大话设计模式第25章_中介着模式.a01同事通知;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:01
 * @Description:
 */
@Data
public class ConcreteMediator extends  Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    @Override
    public void Send(String message, Colleague colleague) {

        if(colleague == colleague1){
            colleague2.Notify(message);
        }else{
            colleague1.Notify(message);
        }

    }
}
