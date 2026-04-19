package 前5题;

import java.util.Scanner;

//九九乘法表加强版
//题目要求
//编写程序，实现以下两个功能：
//输出标准九九乘法表
//用户输入一个整数 n，输出 1~n 的乘法表
//输出示例
//输出 1 到 6 的乘法表。
//限制要求
//必须使用双重循环
//格式尽量整齐
//n 取值范围建议限制在 1~9
public class Four {
public static void main(String[] args) {
	System.out.println("请输入一个整数");
	int n =new Scanner(System.in).nextInt();
	 if (n < 1 || n > 9) {
         System.out.println("输入错误，请输入1到9之间的整数");
         return;
     }
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j + "*" + i + "=" + (i * j) + "\t");
		}
		System.out.println("");
	}
}
}
