package 大话设计模式第22章_桥接模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/18 22:42
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        Abstraction ab =new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.Operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.Operation();


    }
}
