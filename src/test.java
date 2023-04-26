public class test {
    int ModleYear;
    String ModleName;

    public test(int year, String name){
        this.ModleName = name;
        this.ModleYear = year;
    }

    public static void main(String[] args) {
        test test1 = new test(1991, "Joey");
        System.out.println(test1.ModleYear + " " + test1.ModleName);
    }

}
