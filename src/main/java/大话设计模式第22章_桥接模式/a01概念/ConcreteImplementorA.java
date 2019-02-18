package 大话设计模式第22章_桥接模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/18 22:33
 * @Description:
 */
public class ConcreteImplementorA extends  Implementor {
    @Override
    public void Operation() {
        System.out.println("具体实现A的方法执行");
    }
}
