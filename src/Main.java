public class Main {
    public static void main(String[] args) {
        int f1 = 2, f2 = 2, f3;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        for(int i = 3; i <= 12; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
        }
    }
}