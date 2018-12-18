package 大话设计模式第6章.装饰者模式01;

/**
 * 具体服饰类
 */
public class ConcreteDecorator {
}

class TShirts extends  Finery{
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}


class BigTrouser extends  Finery{
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}

class Sneakers extends  Finery{
    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}

class LeatherShoes extends  Finery{
    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}

class Tie extends  Finery{
    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}


class Suit extends  Finery{
    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}