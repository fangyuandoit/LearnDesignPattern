package 大话设计模式第17章_适配器模式.a01理论;

/**
 * @Author: fang
 * @Date: 2019/1/22 22:36
 * @Description: 这是客户所期待的接口。
 */
public abstract class Target {

    void request(){
        System.out.println("普通请求");
    }

}
