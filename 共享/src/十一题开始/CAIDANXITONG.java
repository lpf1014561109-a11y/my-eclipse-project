package 十一题开始;
import java.util.Scanner;

public class CAIDANXITONG {
//	题目要求：
//
//	编写程序，显示如下菜单：
//	1. 登录
//	2. 注册
//	3. 修改密码
//	4. 退出
//	用户输入数字后：
//
//	输入 1：输出“执行登录”
//	输入 2：输出“执行注册”
//	输入 3：输出“执行修改密码”
//	输入 4：输出“退出系统”
//	其他数字：输出“输入有误”
//	必须使用 switch
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 登录");
        System.out.println("2. 注册");
        System.out.println("3. 修改密码");
        System.out.println("4. 退出");
        System.out.print("请输入你的选择：");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("执行登录");
                break;
            case 2:
                System.out.println("执行注册");
                break;
            case 3:
                System.out.println("执行修改密码");
                break;
            case 4:
                System.out.println("退出系统");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
