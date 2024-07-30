public class LoanDeposit extends Deposit {

    LoanDeposit (String name,double balance){
        super(name,balance);
        super.rateInterest=0;

    }

    @Override
    void settle(double amount){
          if ((super.balance-amount)<0 ){
                System.out.println("Deposit Balance After Debit Less Than 0 and Debit Is Not Allowed");
            }else {
                super.balance=super.balance-amount;
                System.out.println("Balance Decreased To Amount "+amount+" And New Balace Is "+ super.balance);
            }
        }
        void debit(double amount) {
        super.balance=super.balance+amount;
        System.out.println("Balance Increased To Amount "+amount+" And New Balace Is "+ super.balance);
    }
}
