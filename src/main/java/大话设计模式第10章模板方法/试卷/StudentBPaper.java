package 大话设计模式第10章模板方法.试卷;

public class StudentBPaper extends TestPaper {
    @Override
    String Answer1() {
        return "c";
    }

    @Override
    String Answer2() {
        return "b";
    }

    @Override
    String Answer3() {
        return "a";
    }
}
