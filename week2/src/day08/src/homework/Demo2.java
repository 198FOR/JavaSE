package homework;

public class Demo2 {
    public static void main(String[] args) {
        Account a1 = new Account("100086", 560);
        a1.print();
        Account a2 = new Account("1086", 56574570);
        a2.print();
        Account a3 = new Account("1465636", 568694570);
        a3.print();

        System.out.println(a1.getBalanceAfterYear(8));
    }
}

class Account {
    int id;
    String pass = "000000";
    double balance;
    static double annualSavingsRate = 0.003;
    static int initId = 10001;


    public Account() {
        id = initId++;
    }

    Account(String pass, double balance) {
        this();
        this.pass = pass;
        this.balance = balance;
    }

    public void print() {
        System.out.println("账户名为" + id + "的账户,密码是" + pass + ",余额是:" + balance);

    }

    public double getBalanceAfterYear(int year) {
        double interest = balance * annualSavingsRate * year;
        return balance + interest;
    }
}
