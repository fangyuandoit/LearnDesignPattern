package Factory工程模式之简单工厂.实现发型;

/**
 * @Date: 2018/12/26 15:18
 * @Description:
 */
public class HairFactory {


    /**
     * 根据类型创建对象
     *
     */
    public  HairInterface getHair(String key){
        if("left".equalsIgnoreCase(key)){
            return new LeftHair();
        }else if("right".equalsIgnoreCase(key)){
           return new  RightHair();
        }
        return null;
    }

    public HairInterface getHairByClass(String className) throws Exception {

        HairInterface hair =  (HairInterface)Class.forName(className).newInstance();
        return hair;
    }

}
