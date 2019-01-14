package 大话设计模式第14章_观察者模式.demo02Weather;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/1/14 22:10
 * @Description:
 */
@Data
public class ConcreteWeatherSubject extends WeatherSubject {

    //获取天气信息
    private String weatherContent;


    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //天气跟新，通知订阅人
        this.notifyObserver();
    }
}
