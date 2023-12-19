package Task;

import Exercise1_to_5.BankAccount;

class SavingAccount extends BankAccount {

    public void transaction(){
        System.out.println("There is a limit of daily transaction in SavinAccounts");
    }

}

class CurrentAccount extends BankAccount{

    public void transaction(){
        System.out.println("There is no limit of daily transaction in CurrentAccounts");
    }

}

public class Question3 {

    public static void main(String[] args) {

        SavingAccount savingAccount=new SavingAccount();
        savingAccount.deposit(1000);
        savingAccount.withdraw(1000);
        savingAccount.transaction();

        CurrentAccount currentAccount=new CurrentAccount();
        currentAccount.deposit(2000);
        currentAccount.withdraw(2000);
        currentAccount.transaction();

    }

}
