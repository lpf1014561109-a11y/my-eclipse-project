package 十一题开始;
import java.util.Scanner;
public class DENGLUYANZHENG {
//登录验证
//	题目要求：
//
//	已知正确密码为：
//	123456
//	要求用户输入密码：
//
//	如果输入正确，输出“登录成功”
//	如果输入错误，允许继续输入
//	最多输入 3 次
//	三次都错，输出“账号已锁定”
//	要求：
//
//	使用循环
//	使用 Scanner
//	很适合仿照你上传的 AppleStore 那道题来写。
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);

        int correctPassword = 123456;
        boolean success = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入密码：");
            int password = sc.nextInt();

            if (password == correctPassword) {
                System.out.println("登录成功");
                success = true;
                break;
            } else {
                System.out.println("密码错误");
            }
        }

        if (!success) {
            System.out.println("账号已锁定");
        }
	}

}
