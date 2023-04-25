package Chapter02.Example11;
/*
 * 设计二维数组，输出、处理杨辉三角形，显示10行的杨辉三角形
 */
public class Example11 {
    public static void main(String[] args) {
        int N = 10;
        int [][]a = new int[N + 1][];

        for(int i = 0; i < N; i++){
            a[i] = new int[i + 1];
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    a[i][j] = 1;
                }else {
                    a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
