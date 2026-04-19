package 六到十题;
//题目要求 定义一个 Product 类，表示商品信息。
//成员变量 name：商品名 price：单价 count：数量
//成员方法 getTotalPrice()：返回该商品总价 showInfo()：输出商品信息 main 方法要求
//创建 3 个商品对象 输出每个商品的信息 计算 3 个商品的总金额 找出总价最高的商品并输出它的信息
public class Nine {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("苹果", 5.5, 4);
        products[1] = new Product("牛奶", 12.0, 2);
        products[2] = new Product("面包", 8.0, 3);

        double sum = 0;
        Product maxProduct = products[0];

        for (int i = 0; i < products.length; i++) {
            products[i].showInfo();
            sum += products[i].getTotalPrice();

            if (products[i].getTotalPrice() > maxProduct.getTotalPrice()) {
                maxProduct = products[i];
            }
        }

        System.out.println("3个商品的总金额为：" + sum);
        System.out.println("总价最高的商品信息如下：");
        maxProduct.showInfo();
    }
}

class Product {
    String name;
    double price;
    int count;

    public Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public double getTotalPrice() {
        return price * count;
    }

    public void showInfo() {
        System.out.println("商品名：" + name + "，单价：" + price + "，数量：" + count + "，总价：" + getTotalPrice());
    }
}