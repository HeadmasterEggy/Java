package Chapter03.ten.school.garden;
import Chapter03.ten.biology.animal.Human;
import Chapter03.ten.biology.plant.Flower;
/*
 * school包中的garden包中一个张三的人,他是一个human类的对象,种植的rose是一个flower类对象
 */
public class Test {
    public static void main(String[] args) {
        Human h1 = new Human("张三", 180, 150);
        h1.eat();
        h1.sleep();
        h1.work();

        System.out.println();

        Flower f1 = new Flower("rose", "red", "charming");
        f1.drink();
        f1.blossom();
    }
}
