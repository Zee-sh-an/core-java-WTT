package Task_Day_5_6;

class BankAccount{
    String Name;
    int AccountNumber;
    int Balance;
    public void  deposite(int amount){
        System.out.println(amount +" amount has been deposited to your account");
        System.out.println("your current balance is "+ (Balance+amount));
    }
    public void withDrawal(int amount){
        System.out.println("your withdrawal amount is "+amount);
        System.out.println("your current balance is "+ (Balance+amount));
    }

        }
public class Question2 {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposite(6786);
        bankAccount.withDrawal(7688);
    }
}
