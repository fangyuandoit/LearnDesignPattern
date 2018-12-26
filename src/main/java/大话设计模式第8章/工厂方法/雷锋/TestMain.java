package 大话设计模式第8章.雷锋;

public class TestMain {
    public static void main(String[] args) {

        IFactory factory =new UndergraduateFactory(); //IFactory factory =new VolunteerFactory();
        LeiFeng student = factory.createLeifeng();
        student.BuyRice();
        student.Sweep();
        student.Wash();

    }
}
