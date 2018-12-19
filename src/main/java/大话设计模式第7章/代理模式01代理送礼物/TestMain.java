package 大话设计模式第7章.代理模式01代理送礼物;

public class TestMain {

    public static void main(String[] args) {

        SchoolGirl jiaojiao =new SchoolGirl("娇娇");

        Proxy daili =new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlower();
        daili.giveChocolate();


    }
}
