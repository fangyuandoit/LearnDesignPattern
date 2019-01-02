package 大话设计模式第10章模板方法.试卷;
//基础试卷模板
public abstract class TestPaper {

    void TestQuestion1(){
        System.out.println("this is 1 quetion. please choose");
        System.out.println("answer--"+Answer1());
    };

    void TestQuestion2(){
        System.out.println("this is 2 quetion. please choose");
        System.out.println("answer--"+Answer2());
    };

    void TestQuestion3(){
        System.out.println("this is 3 quetion. please choose");
        System.out.println("answer--"+Answer3());
    };

    /**
     * 打印试卷结果
     */
    void  check(){
        TestQuestion1();
        TestQuestion2();
        TestQuestion3();
    }

    abstract  String Answer1();
    abstract  String Answer2();
    abstract  String Answer3();


}
