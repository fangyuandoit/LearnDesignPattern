package 大话设计模式第25章_中介着模式.a01同事通知;

import java.util.Collections;

/**
 * @Author: fang
 * @Date: 2019/2/23 21:58
 * @Description:
 */
public abstract class Colleague {

    protected  Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator =mediator;
    }

}
