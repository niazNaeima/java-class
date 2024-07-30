public class ShortTimeDeposit extends Deposit {
    double balance;
    ShortTimeDeposit (String name,double balance){
        super(name,balance);
        super.rateInterest=10;

    }
    void settle(double amount){
        if (super.balance<2000){
            System.out.println("Deposit Balance Less Than 2000 and Debit Is Not Allowed");
    }else {
            if ((super.balance-amount)<2000 ){
                System.out.println("Deposit Balance After Debit Less Than 2000 and Debit Is Not Allowed");
            }else {
                super.balance=super.balance-amount;
                System.out.println("Balance Decreased To Amount "+amount+" And New Balace Is "+ super.balance);
            }
        }

}

    @Override
    void debit(double amount) {
        super.balance=super.balance+amount;
        System.out.println("Balance Increased To Amount "+amount+" And New Balace Is "+ super.balance);
    }
}
