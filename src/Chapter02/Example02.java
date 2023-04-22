package Chapter02;
/*
 * 定义一个整型的长度为3 x 4的二维数组k[3][4]，并将数组中元素k[i][j] 值初始化为值ixj。然后，将元素k[2][3]打印出来。(可以直接赋值).
 */
public class Example02 {
    public static void main(String[] args) {
        int [][]k = new int[3][4];
        for(int i = 0; i < k.length; i++){
            for(int j = 0; j < k[0].length; j++){
                k[i][j] = i * j;
            }
        }
        System.out.println("k[2][3] = " + k[2][3]);
    }
}
