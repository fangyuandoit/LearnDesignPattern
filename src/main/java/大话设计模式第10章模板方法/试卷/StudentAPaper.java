package 大话设计模式第10章模板方法.试卷;

public class StudentAPaper extends  TestPaper {
    @Override
    String Answer1() {
        return "A";
    }

    @Override
    String Answer2() {
        return "B";
    }

    @Override
    String Answer3() {
        return "C";
    }
}
