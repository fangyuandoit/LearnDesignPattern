package Visitor访问者模式.demo1;

public class TestMain {

    public static void main(String[] args) {

        Soldier[] list = {new Gunner(), new Rider(), new Archer()};
        RetreatVisitor retreat = new RetreatVisitor();
        AttackVisitor attack = new AttackVisitor();

        for (Soldier element : list) {
            element.accept(attack);
        }

        System.out.println();

        for (Soldier element : list) {
            element.accept(retreat);
        }


    }

}
