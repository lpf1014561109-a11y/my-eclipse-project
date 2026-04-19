package 前5题;

import java.util.Scanner;

public class Five {
//题目要求
//编写一个带菜单的计算器程序。程序启动后显示菜单：
//1. 加法
//2. 减法
//3. 乘法
//4. 除法
//5. 退出
//用户输入选项后，再输入两个数，程序输出结果。
//除法时要判断除数不能为 0。
//程序执行完一次后，继续显示菜单，直到用户选择退出。
//使用 while 或 do-while 实现循环菜单
//使用 switch 实现功能选择
//支持连续操作
//扩展要求
//把加减乘除分别写成 4 个方法
	public static void main(String[] args) {
		System.out.println("计算器已启动");
		while (1==1) {
			System.out.println("------------------");
			System.out.println("------菜单------");
			System.out.println("-----1. 加法-----");
			System.out.println("-----2. 减法-----");
			System.out.println("-----3. 乘法-----");
			System.out.println("-----4. 除法-----");
			System.out.println("-----5. 退出-----");
			System.out.println("-----请输入-----");
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			if (i>5||i<1) {
				System.out.println("输入错误");
				continue;
			}
			if (i == 5) {
			    System.out.println("程序已退出");
			    break;
			}
			System.out.println("-再输入两个数-");
			int j = scanner.nextInt();
			int x = scanner.nextInt();
			switch (i) {
				case 1:
					System.out.println(x+j);
				break;
				case 2:
					System.out.println(j-x);
				break;	
				case 3:
					System.out.println(x*j);
				break;
				case 4:
					 if (x == 0) {
					        System.out.println("除数不能为0");
					    } else {
					        System.out.println(1.0*j / x);
					    }
					    break;
				}
		}
	}
}
