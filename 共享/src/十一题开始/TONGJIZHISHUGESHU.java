package 十一题开始;
//统计 1~100 之间有多少个质数，并输出所有质数。
//使用循环
//自己判断一个数是不是质数
public class TONGJIZHISHUGESHU {
    public static void main(String[] args) {
    int count = 0;

    System.out.println("1~100之间的质数有：");

    for (int i = 2; i <= 100; i++) {
        boolean isPrime = true;

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print(i + " ");
            count++;
        }
    }

    System.out.println();
    System.out.println("质数个数为：" + count);
}
}
