package 大话设计模式第2章.简单工厂商品打折;

import java.text.BreakIterator;

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
