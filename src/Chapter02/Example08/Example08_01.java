package Chapter02.Example08;
import java.util.Scanner;
public class Example08_01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("输入星号数：");
        int n = cin.nextInt();
        for(int i = 1; i <= n; i++){
            int j;
            for(j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
