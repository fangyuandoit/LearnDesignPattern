package 大话设计模式第12章外观模式_门面模式.子系统;

/**
 * @Author: fang
 * @Date: 2019/1/4 22:59
 * @Description:  外观类，需要了解所有的子系统的方法或属性，进行组合，以备外界调用
 */
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;

    public Facade(){
        one =new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("method a--");
            one.methodOne();
            two.methodTwo();
    }

    public void methodB(){
        System.out.println("method b --");
        two.methodTwo();
        three.methodThree();
    }



}
