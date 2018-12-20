package 大话设计模式第6章.装饰着模式模式02_装饰女士;

public class TestMain {

    public static void main(String[] args) {


        System.out.println("--------------woman----------");
        Woman woman =new Woman(80,80,"fengjie");
        System.out.println(woman.getBeautyIndeex());
        System.out.println(woman.getIq());
        woman.say();

        System.out.println("------------fengjie------------");
DressedUpWomen fengjie = new DressedUpWomen(new Woman(80,80,"fengjie"));
        System.out.println(fengjie.getBeautyIndeex());
        System.out.println(fengjie.getIq());
        fengjie.say();

        System.out.println("--------------fengjie2-----------------");
        EducatedWomen fengjie2 =new EducatedWomen(new Woman(80,80,"fengjie"));
        System.out.println(fengjie2.getBeautyIndeex());
        System.out.println(fengjie2.getIq());
        fengjie2.say();

        System.out.println("------------fengjie3-----------------------------");
        PoliteWomen fengjie3 =new PoliteWomen(new Woman(80,80,"fengjie"));
        System.out.println(fengjie3.getBeautyIndeex());
        System.out.println(fengjie3.getIq());
        fengjie3.say();


        System.out.println("-------woman1-----------");
        Woman woman1 =new DressedUpWomen(new EducatedWomen(new Woman(80,80,"woman1")));
        System.out.println(woman1.getBeautyIndeex());
        System.out.println(woman1.getIq());
        woman1.say();


        System.out.println("----------baby----------------");
        Woman baby =new PoliteWomen(new DressedUpWomen(new EducatedWomen(new Woman(80,80,"baby"))));
        System.out.println(baby.getBeautyIndeex());
        System.out.println(baby.getIq());
        baby.say();


        System.out.println("------------beauty girl--------------");

        Woman beauty =new DressedUpWomen(new DressedUpWomen(new DressedUpWomen(new Woman(80,80,"beauty"))));
        System.out.println(beauty.getBeautyIndeex());
        System.out.println(beauty.getIq());
        beauty.say();


    }

}
