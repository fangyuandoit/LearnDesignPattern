package 大话设计模式第2章.demo03策略和简单工厂结合;

public class TestMain {

    public static void main(String[] args) {

        String[] cashTypes = new String[]{"正常收费", "8折", "6折"};
        String caseType = cashTypes[1];


        CashContext cashContext =new CashContext(caseType);
        double result = cashContext.getResult(100);
        System.out.println(result);


    }

}
