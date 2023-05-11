package Chapter05.KTV;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * 使用LinkedList实现一个模拟KTV点歌系统的程序
 */
public class KTV {
    private static final LinkedList<String> songList = new LinkedList<>();

    public static void main(String[] args) {
        songList.add("夜曲");
        songList.add("晴天");
        songList.add("听妈妈的话");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("当前歌曲列表:");
            printSongList();
            System.out.println("请输入要执行的序号[A-D]:");
            System.out.println("[A]添加歌曲到列表");
            System.out.println("[B]将歌曲置顶（输入歌曲编号）");
            System.out.println("[C]将歌曲前移一位（输入歌曲编号）");
            System.out.println("[D]退出");
            System.out.println("----------------------------");
            String option = scanner.nextLine();
            switch (option.toUpperCase()) {
                case "A" -> {
                    System.out.println("请输入要添加的歌曲名称:");
                    String songName = scanner.nextLine();
                    addSong(songName);
                }
                case "B" -> {
                    System.out.println("请输入要置顶的歌曲编号:");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        topSong(index);
                    } catch (Exception ex) {
                        System.out.println("输入有误，请重新输入！");
                    }
                }
                case "C" -> {
                    System.out.println("请输入要前移的歌曲编号:");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        upSong(index);
                    } catch (Exception ex) {
                        System.out.println("输入有误，请重新输入！");
                    }
                }
                case "D" -> {
                    System.out.println("退出点歌系统！");
                    return;
                }
                default -> System.out.println("输入有误，请重新输入！");
            }
        }
    }

    // 添加歌曲到列表
    private static void addSong(String songName) {
        songList.add(songName);
        System.out.println("已添加歌曲：" + songName);
    }

    // 将歌曲置顶
    private static void topSong(int index) {
        if (index < 0 || index >= songList.size()) {
            System.out.println("输入有误，请重新输入！");
            return;
        }
        String songName = songList.remove(index);
        songList.push(songName);
        System.out.println("已将歌曲：" + songName + " 置顶！");
    }

    // 将歌曲前移一位
    private static void upSong(int index) {
        if (index < 0 || index >= songList.size()) {
            System.out.println("输入有误，请重新输入！");
            return;
        }
        if (index == 0) {
            System.out.println("已在列表第一位，无需前移！");
            return;
        }
        String songName = songList.remove(index);
        songList.add(index - 1, songName);
        System.out.println("已将歌曲：" + songName + " 前移一位！");
    }

    // 打印歌曲列表
    private static void printSongList() {
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(i + ":" + songList.get(i));
        }
    }
}