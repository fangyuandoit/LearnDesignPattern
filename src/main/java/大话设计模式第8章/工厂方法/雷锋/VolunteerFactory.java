package 大话设计模式第8章.雷锋;

public class VolunteerFactory implements  IFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new Volunteer();
    }
}
