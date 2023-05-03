package Chapter03;
/*
 * 有工人、服务员、教师、科学家四种角色，
 * 其中服务员、工人只有月固定工资（元/月），教师除月固定工资外，还有课酬（元/节）。
 * 科学家除月固定工资外，还有科研激励奖（元/季度）。
 * 请通过继承设计出相应的类，将各种类型的员工的全年工资打印出来，
 * 并测试（张三、工人、4000元/月）、（李四、服务员、3500元/月）、（王五、教师、5000元/月、100元/节，200节/年）、（刘六、科学家、7000元/月、20000元/季度）。
 */

public class Employee {
    private final String name;
    protected int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public double getYearSalary(){
        return salary * 12;
    }

    public void getTotal(){
        System.out.println("姓名：" + name);
        System.out.println("工资：" + salary);
    }
}

class Worker extends Employee{
    public Worker(String name, int salary) {
        super(name, salary);
    }
}

class Waiter extends Employee{
    public Waiter(String name, int salary){
        super(name, salary);
    }
}

class Teacher extends Employee {
    private final int paymentYear;
    private final int periodYear;
    public Teacher(String name, int salary, int paymentYear, int periodYear){
        super(name, salary);
        this.paymentYear = paymentYear;
        this.periodYear = periodYear;
    }

    public double getYearSalary(){
        return salary * 12 + paymentYear * periodYear;
    }

    public void getTotal() {
        super.getTotal();
        System.out.println("课酬：" + paymentYear * periodYear);
    }
}

class Scientist extends Employee {
    private final int bonus;

    public Scientist(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getYearSalary(){
        return salary * 12 + bonus;
    }

    public void getTotal(){
        super.getTotal();
        System.out.println("科研激励奖：" + bonus);
    }
}

class Test {
    public static void main(String[] args) {
        Employee employee1 = new Worker("张三", 4000);
        Employee employee2 = new Waiter("李四", 3500);
        Employee employee3 = new Teacher("王五", 7000, 100, 200);
        Employee employee4 = new Scientist("刘六", 7000, 20000);

        employee1.getTotal();
        System.out.println();

        employee2.getTotal();
        System.out.println();

        employee3.getTotal();
        System.out.println();

        employee4.getTotal();
        System.out.println();
    }
}

