package Chapter03;
/*
 * 设计一个表示图书的Book类，它包含图书的书名、作者、月销售量等属性，
 * 另有两个构造方法（一个不带参数，另一个带参数），成员方法setBook( ) 和printBook()分别用于设置和输出书名、作者、月销售量等数据。
 * 并设计相应的测试Book类的应用程序主类，测试并显示输出提供所有功能的结果。
 */
public class Book {
    private String title;
    private String author;
    private int sales;

    public Book() {
    }

    public Book(String title, String author, int sales) {
        this.title = title;
        this.author = author;
        this.sales = sales;
    }

    public void setBook(String title, String author, int sales) {
        this.title = title;
        this.author = author;
        this.sales = sales;
    }

    public void printBook() {
        System.out.println("书名：" + this.title);
        System.out.println("作者：" + this.author);
        System.out.println("月销售量：" + this.sales);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("傲慢与偏见", "简•奥斯汀", 5000);
        book1.printBook();

        Book book2 = new Book("杀死一只知更鸟", "哈珀•李", 7000);
        book2.printBook();
    }
}