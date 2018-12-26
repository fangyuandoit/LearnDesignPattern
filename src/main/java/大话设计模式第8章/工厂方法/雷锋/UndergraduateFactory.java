package 大话设计模式第8章.工厂方法.雷锋;

/**
 * 学雷锋的大学生工厂
 */
public class UndergraduateFactory implements  IFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
