package 大话设计模式第13章_建造者模式_生成器模式.组建电脑;

/**
 * @Author: fang
 * @Date: 2019/1/9 23:07
 * @Description:
 */
public class Computer {

    private String os;
    private String network;
    private String admin;
    private String password;
    private String browser;
    private String office;
    private String chat;
    private String language;
    //分辨率
    private String resolutior;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", network='" + network + '\'' +
                ", admin='" + admin + '\'' +
                ", password='" + password + '\'' +
                ", browser='" + browser + '\'' +
                ", office='" + office + '\'' +
                ", chat='" + chat + '\'' +
                ", language='" + language + '\'' +
                ", resolutior='" + resolutior + '\'' +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getResolutior() {
        return resolutior;
    }

    public void setResolutior(String resolutior) {
        this.resolutior = resolutior;
    }
}
