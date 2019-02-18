package 大话设计模式第22章_桥接模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/18 22:38
 * @Description:
 */
public class RefinedAbstraction extends  Abstraction {



    @Override
    public void Operation() {
        implementor.Operation();
    }
}
