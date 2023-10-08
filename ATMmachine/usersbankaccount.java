import java.util.Scanner;

class ATMmachine {
    String name, type;
    int acctno;
    double balance;
    double wbal;
    Scanner s = new Scanner(System.in);

    public ATMmachine() {
        name = "yashwanth";
        type = "saving";
        acctno = 1234567890;
        balance = 0.00;
    }

    public ATMmachine(String n, String t, int a, double b) {
        name = n;
        type = t;
        acctno = a;
        balance = b;
    }

    void deposit() {
        double dat;
        System.out.println("ENTER  DEPOSIT AMT");
        dat = s.nextDouble(); // You forgot to read the amount from the user
        if (dat > 0) {
            balance = balance + dat;
        } else {
            System.out.println("ENTER INVALID AMT");
        }
    }

    void withdraw() {
        System.out.println("ENTER WITHDRAW AMT");
        wbal = s.nextDouble(); // You forgot to read the amount from the user
        if (wbal > 0 && wbal <= balance) { // Check if the withdrawal amount is valid
            balance = balance - wbal;
        } else {
            System.out.println("ENTERED INVALID AMT");
        }
    }

    void display() {
        System.out.println("Account holder details: " + name);
        System.out.println("Account type: " + type);
        System.out.println("Account number: " + acctno);
        System.out.println("Balance: " + balance);
        System.out.println("");
    }
}

class usersbankaccount {
    public static void main(String[] args) {
        ATMmachine a1 = new ATMmachine("YASH", "SAVING", 1234567899, 100.00);
        a1.display();
        a1.withdraw();
        a1.deposit();
        a1.display(); // Display the updated account information
    }
}
