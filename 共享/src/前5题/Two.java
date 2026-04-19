package 前5题;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// 题目要求
//		编写程序，输入 8 个整数，存入数组中，完成以下操作：
//		按原顺序输出数组
//		倒序输出数组
//		查找数组中的最大值及其下标
//		查找用户输入的某个数字是否存在
//		如果存在，输出其下标
//		如果不存在，输出“未找到”
//		输出要求
//		至少包含：
//		原数组
//		倒序数组
//		最大值和最大值下标
//		查找结果
		Scanner scanner = new Scanner(System.in);
		int [] arr = new int[8];
		System.out.println("请输入8个整数");
		for (int i = 0; i < 8; i++) {
			arr[i] = scanner.nextInt();
		}
		//		按原顺序输出数组
		for (int i = 0; i < 8; i++) {
			System.out.print(arr[i]);			
		}
		//		倒序输出数组
		System.out.print("倒序数组：");
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
		//		查找数组中的最大值及其下标
		int max =arr[0]; 
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i]>max) {
				max=arr[i];
				j=i;
			}			
		}
		System.out.println("最大值为"+max+"下角标为"+j);
		//		查找用户输入的某个数字是否存在
		//		如果存在，输出其下标
		//		如果不存在，输出“未找到”
		int x = scanner.nextInt();
		  boolean found = false;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == x) {
	                System.out.println("找到了，下标为：" + i);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("未找到");
	}
}
}
