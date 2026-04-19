package 前5题;

import java.util.Scanner;

//题目 3：图书借阅天数费用计算
//题目要求
//某图书馆规定：
//借阅 5 天以内（含 5 天），每天 1 元
//超过 5 天的部分，每天 2 元
//如果总天数超过 10 天，额外罚款 10 元
//编写程序，输入借阅天数，输出应支付的总金额。
//说明
//计算方式：
//前 5 天：5 元
//后 7 天：14 元
//超过 10 天罚款：10 元
//等等，这样会是 29，不是 19。
//所以你写程序时要自己认真核算，不要照抄示例错误。这一题故意让你练“看条件 + 自己算逻辑”。
//限制要求
//必须使用 if-else
//输入必须做基本合法性判断：如果天数小于 0，提示输入错误
public class Three {
public static void main(String[] args) {
	System.out.println("欢迎光临图书馆");
	System.out.println("本图书馆5天内每天1元，超过5天的部分每天2元，总天数如果超过10天要罚款10元");
	System.out.println("请输入要借阅的天数");
	int day = new Scanner(System.in).nextInt();
	if (day < 0) {
		System.out.println("输入错误，请重新输入");
		return;
	}
	int money = 0;
	if (day <= 5) {
		money = day * 1;
	} else if (day > 5 && day <= 10) {
		money =  5 * 1+(day - 5 ) * 2;
	}else if (day > 10) {
		money = 5 * 1 + (day - 5) * 2 + 10;
	}
	System.out.println("本次应付金额为"+money);	
	}
}

