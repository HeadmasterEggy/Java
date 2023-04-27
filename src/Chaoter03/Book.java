package Chaoter03;
/*
 * 设计一个表示图书的Book类，它包含图书的书名、作者、月销售量等属性，
 * 另有两个构造方法（一个不带参数，另一个带参数），成员方法setBook( ) 和printBook()分别用于设置和输出书名、作者、月销售量等数据。
 * 并设计相应的测试Book类的应用程序主类，测试并显示输出提供所有功能的结果。
 */
public class Book {
    private String author, name;
    private int sales;

    public Book(String name, String author, int sales){
        this.author = author;
        this.name = name;
        this.sales = sales;
    }

    public void setBook(String name, String author, int sales){
        this.name = name;
        this.author = author;
        this.sales = sales;
    }

    public void printBook(){
        System.out.println("name: " + name);
        System.out.println("author: " + author);
        System.out.println("sales: " + sales);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Think in Java", "Joey", 30000);
        Book book2 = new Book("Effective Java", "Eggy", 100000);
        book1.printBook();
        System.out.println();
        book2.printBook();
    }
}
