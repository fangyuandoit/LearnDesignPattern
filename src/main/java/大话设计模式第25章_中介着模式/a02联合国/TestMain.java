package 大话设计模式第25章_中介着模式.a02联合国;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:41
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) {

        UnitedNationsSecurityCouncil UNSC =new UnitedNationsSecurityCouncil();
        USA c1 =new USA(UNSC);
        Iraq c2 =new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.Declare("不准研制核武器，否则发动战争");
        c2.Declare("我们没有核武器，也不怕战争");

    }
}
