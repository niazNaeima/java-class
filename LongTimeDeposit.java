public class LongTimeDeposit extends Deposit{
    LongTimeDeposit (String name,double balance){
        super(name,balance);
        super.rateInterest=20;

    }
    void settle(double amount){
        System.out.println("Settle In LongTimeDeposit Not Allowed");
    }
    void debit(double amount){
        System.out.println("Debit In LongTimeDeposit Not Allowed");
    }

}
