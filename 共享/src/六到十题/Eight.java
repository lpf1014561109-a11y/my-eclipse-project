package 六到十题;
//题目要求 在上一题基础上，进一步完善 Student 类：
//成员变量 name age score
//构造方法 无参构造方法 有参构造方法：可以在创建对象时直接赋值
//成员方法 showInfo() getLevel()：
//根据成绩返回等级 90 及以上：A 80~89：B 70~79：C 60~69：D 60 以下：E
//main 方法要求 使用无参构造创建一个对象，再赋值
//使用有参构造创建两个对象 输出所有学生信息和等级
//限制要求 必须体现构造方法重载 不要用继承
public class Eight {
    public static void main(String[] args) {
        // 无参构造创建对象，再赋值
        Student2 s1 = new Student2();
        s1.name = "Tom";
        s1.age = 20;
        s1.score = 95;

        // 有参构造创建对象
        Student2 s2 = new Student2("Jack", 19, 82);
        Student2 s3 = new Student2("Lucy", 21, 67);

        // 输出信息和等级
        s1.showInfo();
        System.out.println("等级：" + s1.getLevel());

        s2.showInfo();
        System.out.println("等级：" + s2.getLevel());

        s3.showInfo();
        System.out.println("等级：" + s3.getLevel());
    }
}

class Student2 {
    String name;
    int age;
    int score;

    // 无参构造方法
    public Student2() {
    }

    // 有参构造方法
    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 输出学生信息
    public void showInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score);
    }

    // 返回成绩等级
    public String getLevel() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}