package COM.RAJAT.day52.Medium;

class Bank{
    private int balance = 120000;
    int bal(){
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public int checkBalance(){
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.bal());
        b.deposit(1000);
        b.withdraw(50000);
        System.out.println(b.checkBalance());

    }
}