package 大话设计模式第25章_中介着模式.a02联合国;

import lombok.Data;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:39
 * @Description:
 */
@Data
public class UnitedNationsSecurityCouncil extends  UnitedNations {

    private USA colleague1;
    private Iraq colleague2;

    @Override
    public void Declare(String message, Country colleague) {

        if(colleague == colleague1){
            colleague2.GetMessage(message);
        }else{
            colleague1.GetMessage(message);
        }

    }
}
