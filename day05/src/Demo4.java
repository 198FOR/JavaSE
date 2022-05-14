public class Demo4 {
    public static void main(String[] args) {
        Item S21 = new Item();
        S21.name = "SamSung Galaxy S21";
        S21.price = 8000;
        S21.type = "phone";

        S21.sell(50);

        Item Refrigerator = new Item();
        Refrigerator.name = "海尔冰箱";
        Refrigerator.price = 3000;
        Refrigerator.type = "家电类";

        Item Shampoo = new Item();
        Shampoo.name = "海飞丝洗发水";
        Shampoo.price = 30;
        Shampoo.type = "日用品";
        Shampoo.sell(50);
    }
}

class Item {
    //名字
    String name;
    //价格
    double price;
    //类别
    String type;

    double sell(double money) {
        if (money < price) {
            System.out.println("金钱不足，购买失败");
            return -1;
        }
        System.out.println(name + "被卖出");
        return money - this.price;
    }
}
