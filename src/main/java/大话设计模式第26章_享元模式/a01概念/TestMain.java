package 大话设计模式第26章_享元模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/24 14:36
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        int extrinsicstate = 20;
        FlyweightFactory f =new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicstate);


        Flyweight uf =new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
