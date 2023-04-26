package Chapter04.Example03;
import java.util.Properties;
import java.util.Scanner;
/*
 * 编写一个简单的程序，完成如图下图所示的功能
 */
public class Example03 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请选择操作【请用大写字母】:");
       System.out.println("*********************************************");
       System.out.println("A:记事本");
       System.out.println("B:重启计算机");
       System.out.println("C:启动QQ");
       System.out.println("D:查看系统属性");
       System.out.println("F:退出");
       Runtime run = Runtime.getRuntime();
       while (true) {
           String a = sc.next();
           switch (a) {
               case "A" -> {
                   try {
                       run.exec("notepad");
                   } catch (Exception e) {
                       System.out.println("启动失败");
                   }
               }
               case "B" -> {
                   try {
                       run.exec("shutdown -r");
                   } catch (Exception e) {
                       System.out.println("启动失败");
                   }
               }
               case "C" -> {
                   try {
                       run.exec("\"C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe\"");
                   } catch (Exception e) {
                       System.out.println("启动失败");
                   }
               }
               case "D" -> {
                   Properties pro = System.getProperties();
                   System.out.println(pro);
               }
               case "F" -> {
                   System.out.println("退出");
                   System.exit(1);
               }
           }
       }
   }
}