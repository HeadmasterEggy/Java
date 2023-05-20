package Chapter03;
/*
 * 有工人、服务员、教师、科学家四种角色，
 * 其中服务员、工人只有月固定工资（元/月），教师除月固定工资外，还有课酬（元/节）。
 * 科学家除月固定工资外，还有科研激励奖（元/季度）。
 * 请通过继承设计出相应的类，将各种类型的员工的全年工资打印出来，
 * 并测试（张三、工人、4000元/月）、（李四、服务员、3500元/月）、（王五、教师、5000元/月、100元/节，200节/年）、（刘六、科学家、7000元/月、20000元/季度）。
 */

public class Employee {
    public String name;
    public int salary;
    public String description;

    public Employee(String name, String description, int salary) {
        this.name = name;
        this.salary = salary;
        this.description = description;
    }

    public void print() {
        System.out.println("姓名: " + name);
        System.out.println("职业: " + description);
        System.out.println(("工资: " + salary));
    }
}

class Worker extends Employee {
    public Worker(String name, String description, int salary) {
        super(name, description, salary);
    }
}

class Waiter extends Employee {
    public Waiter(String name, String description, int salary) {
        super(name, description, salary);
    }
}

class Scientist extends Employee {
    public int bonus;

    public Scientist(String name, String description, int salary, int bonus) {
        super(name, description, salary);
        this.bonus = bonus;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("科研激励奖: " + bonus);
    }
}

class Teacher extends Employee {
    public int payment, period;

    public Teacher(String name, String description, int salary, int payment, int period) {
        super(name, description, salary);
        this.payment = payment;
        this.period = period;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("课酬: " + payment + " 元/节");
        System.out.println("课时: " + period + " 节/年");
    }
}

class Test {
    public static void main(String[] args) {
        Employee worker = new Worker("张三", "工人", 4000);
        Employee waiter = new Waiter("李四", "服务员", 3500);
        Employee teacher = new Teacher("王五", "教师", 5000, 100, 200);
        Employee scientist = new Scientist("刘六", "科学家", 7000, 20000);

        worker.print();
        System.out.println();

        waiter.print();
        System.out.println();

        teacher.print();
        System.out.println();

        scientist.print();
        System.out.println();
    }
}