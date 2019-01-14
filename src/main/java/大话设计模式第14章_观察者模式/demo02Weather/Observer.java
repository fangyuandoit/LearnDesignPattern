package 大话设计模式第14章_观察者模式.demo02Weather;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:07
 * @Description:这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {


    /**
     *更新的接口
     *@param subject 传入的目标对象 ，方便获取目标对象的状态
     */
    public void update(WeatherSubject subject);
}
