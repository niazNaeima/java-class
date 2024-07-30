public class DepositMain {
    public static void main(String[] args) {
        Deposit niaz=new LoanDeposit("niaz",1000);
        Deposit nima=new ShortTimeDeposit("nima",20000);
        Deposit arman=new LongTimeDeposit("arman",51000);
        Deposit simin=new ShortTimeDeposit("simin",200000);


        Deposit[] depositList=new Deposit[Deposit.count];
        depositList[0]=niaz;
        depositList[1]=nima;
        depositList[2]=arman;
        depositList[3]=simin;

            {
        }
        for (Deposit deposit : depositList) {
            deposit.interestEndOfMount();
        }
    }
}
