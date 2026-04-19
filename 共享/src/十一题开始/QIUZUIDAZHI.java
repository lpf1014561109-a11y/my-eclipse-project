package 十一题开始;
//求数组最大值、最小值和平均值 
//题目要求： 定义数组： int[] arr = {12, 45, 7, 89, 23, 56}; 
//完成以下功能： 输出数组所有元素 找出最大值 找出最小值 计算总和 计算平均值 
//要求： 必须使用 for 循环 不能手动直接写答案
public class QIUZUIDAZHI {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};

        // 输出数组所有元素
        System.out.print("数组元素为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 假设第一个元素就是最大值和最小值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg = sum * 1.0 / arr.length;

        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("总和为：" + sum);
        System.out.println("平均值为：" + avg);
    }
}

