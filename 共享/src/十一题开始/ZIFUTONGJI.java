package 十一题开始;

public class ZIFUTONGJI {
//给定字符串：
//String text = "banana";
	//统计每个字符出现的次数，并输出，例如：
	//b:1
	//	a:3
	//	n:2
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        String text = "banana";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // 判断这个字符之前有没有出现过
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    flag = true;
                    break;
                }
            }

            // 如果之前出现过，就跳过
            if (flag) {
                continue;
            }

            // 统计当前字符出现次数
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + ":" + count);
        }
    }
}
