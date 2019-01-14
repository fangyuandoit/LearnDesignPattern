package 大话设计模式第14章_观察者模式.demo02Weather;

public class Client {

	
	public static void main(String[] args) {
	//1创建目标
	ConcreteWeatherSubject weather=new ConcreteWeatherSubject();
	//2创建观察者
	ConcreteObserver observerGirl =new ConcreteObserver();
	observerGirl.setObserverName("黄明女朋友");
	observerGirl.setRemindThing("街心公园");
	
	ConcreteObserver observerMum =new ConcreteObserver();
	observerMum.setObserverName("老妈");
	observerMum.setRemindThing("购物好日子");
	
	//注册观察者
	weather.attach(observerGirl);
	weather.attach(observerMum);
	//目标发布天气
   weather.setWeatherContent("明天天气晴朗");
	}

}
