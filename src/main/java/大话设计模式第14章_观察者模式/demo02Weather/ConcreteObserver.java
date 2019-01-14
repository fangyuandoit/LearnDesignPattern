package 大话设计模式第14章_观察者模式.demo02Weather;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:09
 * @Description:具体的观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 */
@Data
public class ConcreteObserver  implements  Observer {

    //观察者的状态
    private String observerName;
    //天气内容
    private String weatherContent;
    //提醒的内容
    private String remindThing;

    @Override
    public void update(WeatherSubject subject) {
        weatherContent=((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observerName+"收到了"+weatherContent+"*"+remindThing);
    }
}
