package 大话设计模式第9章.原型模式.画笔;

import java.util.HashMap;

//统一管理产品, 他来负责注册和克隆
public class UnderLinePenManager {

    /**
     * 各种笔注册到这里, 统一管理
     */
    private static final HashMap<String, Product> PENS = new HashMap<>();

    /**
     * 注册笔
     */
    public static void register(String name, Product pen) {
        PENS.put(name, pen);
    }

    /**
     * 从注册中心HashMap以name为key取出来一只笔, 然后克隆一个新的来返回
     */
    public static Product createPen(String name) {
        return PENS.get(name).createClone();
    }

}
