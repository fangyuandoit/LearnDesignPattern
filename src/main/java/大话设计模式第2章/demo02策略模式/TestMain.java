package 大话设计模式第2章.demo02策略模式;

public class TestMain {

    public static void main(String[] args) {

        String[] cashTypes = new String[]{"正常收费", "8折", "6折"};
        String caseType = cashTypes[0];

        CashContext cc = null;
        switch (caseType) {
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "8折":
                cc = new CashContext(new CashRebate(0.8));
                break;

            case "6折":
                cc = new CashContext(new CashRebate(0.6));
                break;
        }


        double result = cc.getResult(100);
        System.out.println(result);

    }

}
