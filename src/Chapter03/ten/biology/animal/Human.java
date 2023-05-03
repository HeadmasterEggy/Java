package Chapter03.ten.biology.animal;
/*
 * 在biology包中的animal包中有human类,它具有name,height,weight的属性,还具有eat(),sleep()和work()的行为
 */
public class Human {
    private String name;
    private double weight, height;

    public Human(String name, double height, double weight){
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(){
        System.out.println(name + " is eating...");
    }

    public void sleep(){
        System.out.println(name + " is sleeping...");
    }

    public void work(){
        System.out.println(name + " is working...");
    }
}
