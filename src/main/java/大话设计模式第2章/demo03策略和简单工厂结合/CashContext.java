package 大话设计模式第2章.demo03策略和简单工厂结合;

public class CashContext {

    private CashSuper cashSuper=null;

    public CashContext( String  type) {

        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "8折":
                cashSuper = new CashRebate(0.8);
                break;

            case "6折":
                cashSuper = new CashRebate(0.6);
                break;
        }


    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
