package Chapter03;

/*
 * 设计一个表示图书的Book类，它包含图书的书名、作者、月销售量等属性，
 * 另有两个构造方法（一个不带参数，另一个带参数），成员方法setBook( ) 和printBook()分别用于设置和输出书名、作者、月销售量等数据。
 * 并设计相应的测试Book类的应用程序主类，测试并显示输出提供所有功能的结果。
 */
public class Book {
    private String title;
    private String author;
    private int monthlySales;

    public Book() {
        this.title = "";
        this.author = "";
        this.monthlySales = 0;
    }

    public Book(String title, String author, int monthlySales) {
        this.title = title;
        this.author = author;
        this.monthlySales = monthlySales;
    }

    public void setBook(String title, String author, int monthlySales) {
        this.title = title;
        this.author = author;
        this.monthlySales = monthlySales;
    }

    public void printBook() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Monthly Sales: " + this.monthlySales);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("Pride and Prejudice", "Jane Austen", 5000);
        book1.printBook();

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7000);
        book2.printBook();
    }
}