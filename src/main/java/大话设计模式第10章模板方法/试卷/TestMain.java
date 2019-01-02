package 大话设计模式第10章模板方法.试卷;

public class TestMain {

    public static void main(String[] args) {


        System.out.println("studeng a -------------");
        TestPaper a= new StudentAPaper();
        a.check();

        System.out.println("studeng b -------------");
        TestPaper b =new StudentBPaper();
        b.check();


    }

}
