package 大话设计模式第24章_责任链模式.dealnumber;

/**
 * @Author: fang
 * @Date: 2019/2/21 21:30
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {

        Handler h1 =new ConcreteHandle1();
        Handler h2 =new ConcreteHandle2();
        Handler h3 =new ConcreteHandle3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        h1.handleRequest(4);
        h1.handleRequest(16);
        h1.handleRequest(80);


    }

}
