package 六到十题;

import java.util.Scanner;

public class Six {
//题目要求

//编写程序，输入 5 名学生的成绩，使用方法完成以下功能：
//
//printScores(int[] arr)：输出所有成绩
//getSum(int[] arr)：返回总分
//getAvg(int[] arr)：返回平均分
//getMax(int[] arr)：返回最高分
//getMin(int[] arr)：返回最低分
//countPass(int[] arr)：返回及格人数
//
//在 main 方法中调用这些方法并输出结果。
//	限制要求
//	必须拆分成多个方法
//	不能把所有逻辑全写在 main 里
//	参数传递和返回值要写规范

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("请输入5个学生的成绩：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printScores(arr);
        System.out.println("总分：" + getSum(arr));
        System.out.println("平均分：" + getAvg(arr));
        System.out.println("最高分：" + getMax(arr));
        System.out.println("最低分：" + getMin(arr));
        System.out.println("及格人数：" + countPass(arr));
    }

    // 输出所有成绩
    public static void printScores(int[] arr) {
        System.out.print("所有成绩：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 返回总分
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 返回平均分
    public static double getAvg(int[] arr) {
        return getSum(arr) * 1.0 / arr.length;
    }

    // 返回最高分
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 返回最低分
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 返回及格人数
    public static int countPass(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }
}

