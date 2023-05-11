package Chapter03;
/*
 * 请创建一个银行帐户类，要求如下：（１）类包括帐户名、帐户号、存款额等属性；（２）可实现余额查询，存款和取款的操作。（３）创建该类的对象，验证以上两项。
 */
public class BankAccount {
    private String name;
    private int account;
    private double balance;

    public BankAccount(String name, int account, double balance){
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public void inquiry(){
        System.out.println("name: " + name);
        System.out.println("account: " +  account);
        System.out.println("balance: " + balance);
        System.out.println();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("取出 " + amount + " 元, 可用余额：");
        inquiry();
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("存入 " + amount + " 元, 可用余额：");
        inquiry();
    }
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Joey", 2021016707, 700.00);
        a.inquiry();
        a.withdraw(200);
        a.deposit(500);
    }
}
