package 大话设计模式第22章_桥接模式.a01概念;

/**
 * @Author: fang
 * @Date: 2019/2/18 22:36
 * @Description:
 */

public    class Abstraction {

    protected  Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public    void  Operation(){
        implementor.Operation();
    }

}
