package src.Exercise1_to_5;

public class BankAccount{
    private  int Balance;
    private int Account_Number;

    public void deposit(int money){
        if (money<0){
            System.out.println("Please enter valid amount");
        }else {
            System.out.println("Your money is deposited : " + money);
        }
    }
    public void withdraw(int money){
        if (money<0){
            System.out.println("Please enter valid amount");
        }else {
            System.out.println( money +" : is withdrawal ");

        }
    }

    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();

            bankAccount.deposit(4500);
            bankAccount.withdraw(6000);
    }
}