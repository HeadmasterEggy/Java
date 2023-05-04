package Chapter03.Student;
/*
 * 设计一个学生类Student，其数据成员有name(姓名)、age(年龄)和degree(学位)。
 * 由Student类派生出本科生类Undergraduate和研究生类Graduate，本科生类Undergraduate增加成员specialty(专业)，研究生类增加成员direction(研究方向)。
 * 每个类都有show()方法，用于输出数据成员信息。
 */
abstract class Student {
    protected String name, degree;
    protected int age;

    public Student(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public abstract void show();

    protected void shown() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("学位：" + degree);
    }

    public static void main(String[] args) {
        Student stu2 = new Undergraduate("Joey", 19, "undergraduate", "Computer Science");
        Student stu3 = new Graduate("Eggy", 23, "graduate", "Front-end");

        stu2.show();
        System.out.println();

        stu3.show();
        System.out.println();
    }
}

class Undergraduate extends Student{
    private final String specialty;

    public Undergraduate(String name, int age, String degree, String specialty) {
        super(name, age, degree);
        this.specialty = specialty;
    }

    @Override
    public void show(){
        shown();
        System.out.println("专业：" + specialty);
    }
}

class Graduate extends Student{
    private final String direction;

    public Graduate(String name, int age, String degree, String direction) {
        super(name, age, degree);
        this.direction = direction;
    }

    @Override
    public void show(){
        shown();
        System.out.println("研究方向：" + direction);
    }
}