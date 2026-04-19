package 十一题开始;
//定义一个 Contact 类：
//成员变量 name phone age
//成员方法 showInfo()：显示联系人信息
//再编写主程序，实现如下菜单功能：
//1. 添加联系人 2. 显示所有联系人 3. 按姓名查找联系人 4. 统计联系人数量 
//5. 删除指定姓名联系人 6. 退出
//具体要求 最多保存 10 个联系人 使用 Contact[] 数组保存对象 
//删除时可以把对应位置设为 null 显示联系人时要跳过 null 查找时如果找不到，要提示 
//难点
//这题的难点不是语法，
//而是： 
//对象数组怎么存 怎么判断某个位置是否为空 删除后如何继续管理数据 做出来
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[10];

        while (true) {
            System.out.println("====== 通讯录系统 ======");
            System.out.println("1. 添加联系人");
            System.out.println("2. 显示所有联系人");
            System.out.println("3. 按姓名查找联系人");
            System.out.println("4. 统计联系人数量");
            System.out.println("5. 删除指定姓名联系人");
            System.out.println("6. 退出");
            System.out.print("请选择功能：");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact(contacts, sc);
                    break;
                case 2:
                    showAllContacts(contacts);
                    break;
                case 3:
                    findContactByName(contacts, sc);
                    break;
                case 4:
                    countContacts(contacts);
                    break;
                case 5:
                    deleteContactByName(contacts, sc);
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

    // 1. 添加联系人
    public static void addContact(Contact[] contacts, Scanner sc) {
        int index = -1;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("通讯录已满，最多只能保存10个联系人");
            return;
        }

        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入电话：");
        String phone = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();

        contacts[index] = new Contact(name, phone, age);
        System.out.println("添加成功");
    }

    // 2. 显示所有联系人
    public static void showAllContacts(Contact[] contacts) {
        boolean hasContact = false;

        System.out.println("所有联系人信息如下：");
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                contacts[i].showInfo();
                hasContact = true;
            }
        }

        if (!hasContact) {
            System.out.println("通讯录为空");
        }
    }

    // 3. 按姓名查找联系人
    public static void findContactByName(Contact[] contacts, Scanner sc) {
        System.out.print("请输入要查找的姓名：");
        String name = sc.next();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].name.equals(name)) {
                System.out.println("查找到的联系人信息如下：");
                contacts[i].showInfo();
                return;
            }
        }

        System.out.println("未找到该联系人");
    }

    // 4. 统计联系人数量
    public static void countContacts(Contact[] contacts) {
        int count = 0;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                count++;
            }
        }

        System.out.println("当前联系人数量为：" + count);
    }

    // 5. 删除指定姓名联系人
    public static void deleteContactByName(Contact[] contacts, Scanner sc) {
        System.out.print("请输入要删除的姓名：");
        String name = sc.next();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].name.equals(name)) {
                contacts[i] = null;
                System.out.println("删除成功");
                return;
            }
        }

        System.out.println("未找到该联系人");
    }
}

class Contact {
    String name;
    String phone;
    int age;

    public Contact(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("姓名：" + name + "，电话：" + phone + "，年龄：" + age);
    }
}