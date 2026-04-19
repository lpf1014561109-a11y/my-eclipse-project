package 十一题开始;

public class FANGFALIANXI {
//定义以下方法：
//	getSum(int a, int b)：返回两个整数之和
//	getMax(int a, int b)：返回较大的数
//	isEven(int num)：判断一个数是否为偶数，返回 true/false
//	然后在 main 方法中调用并输出结果。
	public static void main(String[] args) {
	        System.out.println("两数之和：" + getSum(10, 20));
	        System.out.println("较大的数是：" + getMax(15, 8));
	        System.out.println("10是否为偶数：" + isEven(10));
	        System.out.println("7是否为偶数：" + isEven(7));
	    }

	    // 返回两个整数之和
	    public static int getSum(int a, int b) {
	        return a + b;
	    }

	    // 返回较大的数
	    public static int getMax(int a, int b) {
	        if (a > b) {
	            return a;
	        } else {
	            return b;
	        }
	    }

	    // 判断一个数是否为偶数
	    public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }
}
