package 六到十题;
//题目要求
//定义一个 Account 类，模拟简单银行账户。
//成员变量 id：账户编号 name：户主姓名 balance：余额
//成员方法 showInfo()：显示账户信息 deposit(double money)：存款 withdraw(double money)：取款
//如果余额不足，
//提示“余额不足” transfer(Account target, double money)：向另一个账户转账 main 方法要求
public class Ten {
    public static void main(String[] args) {
        Account a1 = new Account("1001", "Tom", 1000);
        Account a2 = new Account("1002", "Jack", 500);

        // 存款
        a1.deposit(300);

        // 取款
        a2.withdraw(200);

        // 转账
        a1.transfer(a2, 400);

        // 输出两个账户信息
        System.out.println("----账户1信息----");
        a1.showInfo();

        System.out.println("----账户2信息----");
        a2.showInfo();
    }
}

class Account {
    String id;
    String name;
    double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // 显示账户信息
    public void showInfo() {
        System.out.println("账户编号：" + id + "，户主姓名：" + name + "，余额：" + balance);
    }

    // 存款
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println(name + " 存款成功，存入：" + money);
        } else {
            System.out.println("存款金额错误");
        }
    }

    // 取款
    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("取款金额错误");
        } else if (balance < money) {
            System.out.println("余额不足");
        } else {
            balance -= money;
            System.out.println(name + " 取款成功，取出：" + money);
        }
    }

    // 转账
    public void transfer(Account target, double money) {
        if (money <= 0) {
            System.out.println("转账金额错误");
        } else if (balance < money) {
            System.out.println("余额不足");
        } else {
            balance -= money;
            target.balance += money;
            System.out.println(name + " 向 " + target.name + " 转账成功，金额：" + money);
        }
    }
}