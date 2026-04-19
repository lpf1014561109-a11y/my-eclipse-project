package 前5题;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//编写一个 Java 程序，输入 5 名学生的成绩，完成以下功能：
		//输出所有学生成绩
		//计算总分
		//计算平均分
		//找出最高分和最低分
		//统计及格人数（60 分及以上）
		//		输出要求
		//		输出内容至少包含：
		//		所有成绩
		//		总分
		//		平均分
		//		最高分
		//		最低分
		//		及格人数
		//		限制要求
		//		必须使用数组
		//		必须使用循环
		//		平均分保留到小数也可以，不强制
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("请输入5名同学的成绩");
		for (int i = 0; i < 5; i++) {
			arr[i]=scanner.nextInt();
		}
		//第一题 成绩依次
		System.out.print("成绩依次为");
		 for (int i = 0; i < 5; i++) {
	            System.out.print(arr[i] + " ");
	        }
		 //第二题 总分
		 int sum =0;
		 for (int i = 0; i < arr.length; i++) {
			 sum += arr[i];
		}
		 System.out.println();
		 System.out.println("成绩之和为" + sum);
		 
		//第三题 平均分
		 System.out.println("平均数为"+sum / 5);

		//		最高分和最低分
		 int max = arr[0];
		 int min = arr[0];
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] > max) {
			        max = arr[i];
			}	
			 if (arr[i] < min) {
			        min = arr[i];
		    }
		}
		 System.out.println("最高分为"+max);
		 System.out.println("最低分为"+min);
		 
		 //		及格人数需要进行设定
		 int count = 0;
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 60) {
		        count++;		
			}
		 }
		 System.out.println("合格人数为"+count);
	}
		
	}

