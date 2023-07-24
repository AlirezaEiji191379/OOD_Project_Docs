package financial.entities;

public class WalletEntity {

    private int userId;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void increaseBalance(int balance) {
        this.balance += balance;
    }

    public void decreaseBalance(int balance) {
        this.balance += balance;
    }
}
