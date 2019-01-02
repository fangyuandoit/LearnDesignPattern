package 大话设计模式第9章.原型模式.画笔;

public class TestMain {
    static {
        /**
         * 将各种笔注册到Manager来统一管理
         */
        UnderLinePenManager.register("wave-line"  , new UnderLinePen('~'));
        UnderLinePenManager.register("bee-line"   , new UnderLinePen('_'));
        UnderLinePenManager.register("dotted-line", new UnderLinePen('.'));
    }

    public static void main(String[] args) {

// 每次需要某种笔的时候, 根据现有的笔来进行克隆一份就好了
        // 取出一只波浪线的笔
        Product anotherPen1 = UnderLinePenManager.createPen("bee-line");
        // 用波浪线的笔来打印
        anotherPen1.use("hello world");

    }
}
