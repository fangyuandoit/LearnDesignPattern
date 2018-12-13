package 大话设计模式第2章.demo01简单工厂商品打折;

public class TestMain {

    public static void main(String[] args) {

        String [] cashTypes = new String[]{"正常收费","8折","6折"};
        String caseType=cashTypes[2];

        CashSuper cashAccept = CashFactory.createCashAccept(caseType);

        double v = cashAccept.acceptCash(100);
        System.out.println("价格:---"+v);


    }

}
