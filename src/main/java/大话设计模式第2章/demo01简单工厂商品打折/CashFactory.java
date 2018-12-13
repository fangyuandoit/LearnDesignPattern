package 大话设计模式第2章.demo01简单工厂商品打折;

public class CashFactory {

    public static CashSuper createCashAccept(String type) {

        CashSuper cashSuper = null;
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
        return cashSuper;
    }

}
