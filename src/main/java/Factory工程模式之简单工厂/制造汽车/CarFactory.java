package Factory工程模式之简单工厂.制造汽车;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @Date: 2018/12/26 16:25
 * @Description: 汽车制造工厂
 */
public class CarFactory {

    static Properties config =new Properties();
    static{
        try {
            config.load(new InputStreamReader(CarFactory.class.getResourceAsStream("config.properties"),"gbk"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  ICar  getCar() throws Exception{
        String clazzName = config.getProperty("Car");
        ICar car = (ICar) Class.forName(clazzName).newInstance();
        return car;
    }

}
