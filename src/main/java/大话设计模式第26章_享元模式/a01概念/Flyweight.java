package 大话设计模式第26章_享元模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/24 14:24
 * @Description:  flyweight类，它是所有具体享元类的超类或接口，通过这个接口
 * flyweight可以接受并作用于外部状态
 */
public abstract class Flyweight {

    public  abstract  void operation(int extrinsicstate);
}
