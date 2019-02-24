package 大话设计模式第26章_享元模式.a01概念;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: fang
 * @Date: 2019/2/24 14:31
 * @Description:
 */
public class FlyweightFactory {

    private ConcurrentHashMap flyweights =new ConcurrentHashMap();

    //初始化工厂时，先生成三个实例
    public FlyweightFactory(){
         flyweights.put("X",new ConcreteFlyweight());
         flyweights.put("Y",new ConcreteFlyweight());
         flyweights.put("Z",new ConcreteFlyweight());
    }

    //根据客户端请求，获得已生成的实例
    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }

}
