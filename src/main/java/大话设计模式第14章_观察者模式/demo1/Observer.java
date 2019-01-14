package 大话设计模式第14章_观察者模式.demo1;


/**
 * @Author: fang
 * @Date: 2019/1/12 16:26
 * @Description: 一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {

    /**
     * 功能描述:  subject 传入的目标对象 ，方便获取目标对象的状态
     *
     * @param:
     * @return:
     * @author: fang
     * @date: 2019/1/12 16:35
     */
    void update(Subject subject);
}
