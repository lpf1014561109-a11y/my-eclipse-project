package 十一题开始;
//题目要求：
//
//定义一个方法：
//public static int countPass(int[] scores)
//功能：
//
//统计一个成绩数组中及格人数（60 分及以上）
//测试数组：
//
//int[] scores = {45, 67, 89, 34, 90, 60, 59};
//
//输出及格人数。
public class FANGFAZONGHETI {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {45, 67, 89, 34, 90, 60, 59};

        int count = countPass(scores);
        System.out.println("及格人数为：" + count);
    }

    public static int countPass(int[] scores) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }

        return count;
    }
}
