package entities;

public class Saque {

    private int number; //Numero conta
    private String holder; //Nome conta
    private double balance; //Balanço

    public Saque(int number, String holder) { //Construtor 2 parametros
        this.number = number;
        this.holder = holder;
    }

    public Saque(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); 
    }

     public int getNumber() {
        return number;
    }

    /*public void setNumber(int number) {
        this.number = number; NAO PODE SER ALTERADO N CONTA
    }*/

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) { //Deposito
        balance += amount;
    }

    public void withdraw (double amount) {
        balance -= amount + 5.0; //Abater do saldo a quantia +5
    }

    public String toString() {
        return "Account: " 
        + number 
        + ", HOLDER: " 
        + holder 
        + ", Balance: $" 
        + String.format("%.2f", balance);
    }
   
}
