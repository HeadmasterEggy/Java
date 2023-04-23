package Chapter02.Example08;

import java.util.Scanner;

public class Example08_05 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("输入星号数：");
        int n = cin.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = 2 * i + 2; k <= 2 * n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
