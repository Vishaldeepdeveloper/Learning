import java.util.Scanner;

public class Main {
    int money;

    public static void Main(String[] args) {
        Paytm pm = new Paytm();

        CreditCard cc = new CreditCard();

        Functions functions = new Functions();

        this.money = functions.getmoney();

        pm.pay(money);
    }
}

class Functions {
    Scanner scan = new Scanner(System.in);

    int getmoney() {
        System.out.println("Enter the amount of money in rupees");
        int money = this.scan.nextInt();
        return money;
    }
}