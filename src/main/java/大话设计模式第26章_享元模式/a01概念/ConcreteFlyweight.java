package 大话设计模式第26章_享元模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/24 14:26
 * @Description: 继承flyweight超类或实现flyweight接口，并为内部状态增加存储空间
 */
public class ConcreteFlyweight extends  Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体flyweight"+extrinsicstate);
    }
}
