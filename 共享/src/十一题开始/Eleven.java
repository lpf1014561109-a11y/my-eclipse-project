package 十一题开始;

import java.util.Scanner;
//定义一个 Student 类，包含： 学号 id 姓名 name 成绩 score 
//然后编写主程序，实现一个简单菜单： 
//1. 添加学生 2. 显示所有学生 3. 查询最高分学生 4. 查询平均分
//5. 按学号查找学生 6. 退出 
//具体要求 最多存 5 个学生 
//使用 Student[] 数组保存学生对象 添加学生时，把新建对象放进数组中 
//查询功能通过循环实现 平均分只统计已录入的学生 
//限制要求 必须使用： 类 对象数组 菜单循环 方法 不使用集合 ArrayList
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        int count = 0;

        while (true) {
            System.out.println("======== 班级管理系统 ========");
            System.out.println("1. 添加学生");
            System.out.println("2. 显示所有学生");
            System.out.println("3. 查询最高分学生");
            System.out.println("4. 查询平均分");
            System.out.println("5. 按学号查找学生");
            System.out.println("6. 退出");
            System.out.print("请选择功能：");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    count = addStudent(students, count, sc);
                    break;
                case 2:
                    showAllStudents(students, count);
                    break;
                case 3:
                    showTopStudent(students, count);
                    break;
                case 4:
                    showAverageScore(students, count);
                    break;
                case 5:
                    findStudentById(students, count, sc);
                    break;
                case 6:
                    System.out.println("程序已退出");
                    return;
                default:
                    System.out.println("输入错误，请重新选择");
            }

            System.out.println();
        }
    }

    public static int addStudent(Student[] students, int count, Scanner sc) {
        if (count >= students.length) {
            System.out.println("学生已满，最多只能添加5个学生");
            return count;
        }

        System.out.print("请输入学号：");
        int id = sc.nextInt();
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入成绩：");
        double score = sc.nextDouble();

        Student s = new Student(id, name, score);
        students[count] = s;
        count++;

        System.out.println("添加成功");
        return count;
    }

    public static void showAllStudents(Student[] students, int count) {
        if (count == 0) {
            System.out.println("暂无学生信息");
            return;
        }

        System.out.println("所有学生信息如下：");
        for (int i = 0; i < count; i++) {
            students[i].showInfo();
        }
    }

    public static void showTopStudent(Student[] students, int count) {
        if (count == 0) {
            System.out.println("暂无学生信息");
            return;
        }

        Student maxStudent = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].score > maxStudent.score) {
                maxStudent = students[i];
            }
        }

        System.out.println("最高分学生信息如下：");
        maxStudent.showInfo();
    }

    public static void showAverageScore(Student[] students, int count) {
        if (count == 0) {
            System.out.println("暂无学生信息");
            return;
        }

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].score;
        }

        double avg = sum / count;
        System.out.println("平均分为：" + avg);
    }

    public static void findStudentById(Student[] students, int count, Scanner sc) {
        if (count == 0) {
            System.out.println("暂无学生信息");
            return;
        }

        System.out.print("请输入要查找的学号：");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                System.out.println("查找到的学生信息如下：");
                students[i].showInfo();
                return;
            }
        }

        System.out.println("未找到该学号对应的学生");
    }
}

class Student {
    int id;
    String name;
    double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学号：" + id + "，姓名：" + name + "，成绩：" + score);
    }
}