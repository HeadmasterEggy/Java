package Chapter03.ten.biology.plant;
/*
 * 在biology包中的plant包中有flower类,它具有name,color,smell的属性,还具有drink()和blossom()的行为
 */
public class Flower {
    private String name, color, smell;

    public Flower(String name, String color, String smell){
        this.name = name;
        this.color = color;
        this.smell = smell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void drink(){
        System.out.println(name + " is drinking...");
    }

    public void blossom(){
        System.out.println(name + " is blossoming...");
    }
}
