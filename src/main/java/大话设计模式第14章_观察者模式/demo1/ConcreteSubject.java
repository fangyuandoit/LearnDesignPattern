package 大话设计模式第14章_观察者模式.demo1;

/**
 * @Author: fang
 * @Date: 2019/1/12 16:48
 * @Description: 具体目标对象，负责把有关状态存入到相关的观察者对象中
 */
public class ConcreteSubject extends Subject {

    /**
     * /目标对象状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObserver();
    }

}
