package example1;
/*
 * 定义一个整型的长度为6的一维数组k[6]，并将数组中元素k[i] 值初始化为i。然后，将元素k[3]打印出来
 */
public class quest1 {
    public static void main(String[] args) {
        int []k = new int[6];
        for(int i = 0; i < k.length; i++){
            k[i] = i;
        }
        System.out.println("k[3] = " + k[3]);
    }
}
