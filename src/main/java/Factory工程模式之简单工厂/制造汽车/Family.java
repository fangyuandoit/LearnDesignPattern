package Factory工程模式之简单工厂.制造汽车;

/**
 * @Date: 2018/12/26 16:39
 * @Description:  家庭关联一个汽车
 */
public class Family {
    private  ICar iCar;

    public Family(ICar iCar) {
        this.iCar = iCar;
    }

    public void goOut(){
        System.out.println("全家自驾游");
        iCar.run();
        System.out.println("玩得开心");
    }
}
