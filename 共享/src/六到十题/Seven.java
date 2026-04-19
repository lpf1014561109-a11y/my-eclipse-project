package 六到十题;
//题目要求 定义一个 Student 类，包含以下内容：
//成员变量 name（姓名） age（年龄） score（成绩）
//成员方法 showInfo()：输出学生信息 isPass()：判断是否及格，及格返回 true，否则返回 false
//然后在 main 方法中：创建 3 个 Student 对象 为对象赋值
//输出每个学生的信息 输出每个学生是否及格 统计 3 个学生中及格的人数 
//输出示例
//格式可自定，例如：
//姓名：Tom，年龄：20，成绩：78 是否及格：true
//限制要求 必须定义类 必须创建对象 必须通过 对象.方法() 调用
//
public class Seven {

	public static void main(String[] args) {
			Student s1 = new Student();
	        s1.name = "Tom";
	        s1.age = 20;
	        s1.score = 78;
	
	        Student s2 = new Student();
	        s2.name = "Jack";
	        s2.age = 19;
	        s2.score = 56;
	
	        Student s3 = new Student();
	        s3.name = "Lucy";
	        s3.age = 21;
	        s3.score = 90;
	
	        int count = 0;
	
	        s1.showInfo();
	        System.out.println("是否及格：" + s1.isPass());
	        if (s1.isPass()) {
	            count++;
	        }
	
	        s2.showInfo();
	        System.out.println("是否及格：" + s2.isPass());
	        if (s2.isPass()) {
	            count++;
	        }
	
	        s3.showInfo();
	        System.out.println("是否及格：" + s3.isPass());
	        if (s3.isPass()) {
	            count++;
	        }
	
	        System.out.println("及格人数：" + count);
	    }
	}

class Student {
    String name;
    int age;
    int score;

    public void showInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score);
    }

    public boolean isPass() {
        return score >= 60;

	}

}
