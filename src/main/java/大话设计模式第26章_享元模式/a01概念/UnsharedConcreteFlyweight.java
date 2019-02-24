package 大话设计模式第26章_享元模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/24 14:29
 * @Description: 指那些不需要共享的flyweight子类。因为flyweight接口共享成为可能，但它并不强制共享
 */
public class UnsharedConcreteFlyweight extends  Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体flyweight" + extrinsicstate);
    }
}
