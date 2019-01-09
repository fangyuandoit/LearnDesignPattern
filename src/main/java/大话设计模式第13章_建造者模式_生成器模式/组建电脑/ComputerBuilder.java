package 大话设计模式第13章_建造者模式_生成器模式.组建电脑;

/**
 * @Author: fang
 * @Date: 2019/1/9 23:09
 * @Description: 一个电脑默认应该有window系统，ie浏览器。但是在建造的过程中可以换成linux系统，firefox浏览器。后期的
 * 网络，密码，office可以选配。
 */
public class ComputerBuilder {


    private String os = "window";
    private String network;
    private String admin;
    private String password;
    private String browser = "IE";
    private String office;
    private String chat;
    private String language;
    private String resolutior;

    public ComputerBuilder setOs(String os ){
        this.os=os;
        return this;
    }

    public ComputerBuilder setBrowser(String browser){
        this.browser  =browser;
        return this;
    }

    public Computer bulid(){
        Computer computer =new Computer();
        computer.setOs(os);
        computer.setBrowser(browser);
        return computer;
    }


}
