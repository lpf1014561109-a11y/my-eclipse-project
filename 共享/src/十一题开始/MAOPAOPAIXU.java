package 十一题开始;
//练习题 3：冒泡排序
//题目要求：
//定义数组：
//int[] arr = {8, 3, 12, 5, 2, 9};
//使用冒泡排序从小到大排序，并输出排序后的结果。
//要求：
//不能调用现成排序方法
//必须自己写双重循环

public class MAOPAOPAIXU {
	 public static void main(String[] args) {
	        int[] arr = {8, 3, 12, 5, 2, 9};

	        // 冒泡排序：从小到大
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.print("排序后的结果为：");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
}
