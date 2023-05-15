package Chapter06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 用FileInputStream和FileOutputStream来实现一个文件移动程序，并测试移动1G文件所需要的时间。
 */
public class FileMovement {
    public static void main(String[] args) {
        String filePath1 = "/Users/joey/Downloads/macos-big-sur.jpg";
        String filePath2 = "/Users/joey/Desktop/macos-big-sur.jpg";
        long start = System.currentTimeMillis();

        //使用FileInputStream和FileOutputStream实现文件移动
        try (FileInputStream fis = new FileInputStream(filePath1);
             FileOutputStream fos = new FileOutputStream(filePath2)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("移动文件所需的时间：" + (end - start) / 1000f + "秒");
    }
}

