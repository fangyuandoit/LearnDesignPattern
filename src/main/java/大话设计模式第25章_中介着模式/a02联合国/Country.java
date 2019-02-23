package 大话设计模式第25章_中介着模式.a02联合国;

/**
 * @Author: fang
 * @Date: 2019/2/23 22:35
 * @Description:国家类
 */
public  abstract  class Country {

protected  UnitedNations mediator;

public Country(UnitedNations mediator){
    this.mediator =mediator;
}

}
