package 大话设计模式第6章.装饰者模式01;

public class TestMain {

    public static void main(String[] args) {

        Person xc =new Person("小菜");
        System.out.println("first way----------");

        Sneakers pqx =new Sneakers();
        BigTrouser kk =new BigTrouser();
        TShirts dtx = new TShirts();
        pqx.Decorate(xc);
        kk.Decorate(pqx);
        dtx.Decorate(kk);
        dtx.show();

        System.out.println("second way-----------");

        LeatherShoes px= new LeatherShoes();
        Tie ld =new Tie();
        Suit xz =new Suit();
        px.Decorate(xc);
        ld.Decorate(px);
        xz.Decorate(ld);
        xz.show();



    }
}
