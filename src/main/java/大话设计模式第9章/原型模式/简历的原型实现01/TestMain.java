package 大话设计模式第9章.原型模式.简历的原型实现01;

public class TestMain {

    public static void main(String[] args) throws Exception{
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","xx company");

        Resume b = (Resume) a.cloneMethod();
        b.setWorkExperience("2001-2004","cc company");

        Resume c = (Resume) a.cloneMethod();
        c.setPersonalInfo("男","35");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a.display();
        b.display();
        c.display();

    }


}
