package Task;

interface SavingsAccount{
    void deposit(int money);
    void withdrawal(int money);
}
interface CheckingAccount{
    void deposit(int money);
    void withdrawal(int money);
}
class BankAccount implements SavingsAccount,CheckingAccount{

    public void deposit(int money){
        System.out.println("Your money is deposited : " + money);
    }
    public void withdrawal(int money){
        System.out.println( money +" : is withdrawal ");
    }
}
public class Question9 {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();

        bankAccount.deposit(4500);
        bankAccount.withdrawal(6000);
    }
}
