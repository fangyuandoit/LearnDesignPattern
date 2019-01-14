package 大话设计模式第14章_观察者模式.demo1;

/**
 * @Author: fang
 * @Date: 2019/1/12 16:47
 * @Description:
 */
public class ConcreteObserver implements  Observer {

    //观察者的状态
    private String observerState;
    @Override
    public void update(Subject subject) {
        observerState  =((ConcreteSubject)subject).getSubjectState();
    }
}
