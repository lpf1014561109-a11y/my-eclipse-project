package 十一题开始;
import java.util.Random;
//猜数字游戏 题目要求： 生成一个 0~9 的随机数 让用户最多猜 5 次 
//如果猜对了，输出“恭喜你，猜对了”，并结束程序 
//如果猜错了，输出“猜错了” 5 次都没猜中，输出“游戏结束，答案是xxx” 
//要求： 使用 Scanner 使用 for 或 while 使用 break
import java.util.Scanner;
public class CAISHUZIYOUXI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(10); // 生成 0~9 的随机数
        boolean flag = false; // 记录是否猜中

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入你猜的数字(第" + i + "次)：");
            int guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("恭喜你，猜对了");
                flag = true;
                break;
            } else {
                System.out.println("猜错了");
            }
        }

        if (!flag) {
            System.out.println("游戏结束，答案是" + answer);
        }
    }
}
