public abstract class Deposit {
    String name;
    double balance;
    int rateInterest;
    double amount;
    static int count=0;

    Deposit (String name,double balance){
        this.name=name;
        this.balance=balance;
        count++;
    }

    abstract void settle(double amount);
    abstract void debit(double amount);
    public void interestEndOfMount(){
        System.out.println("Interest End Of Mount for "+this.name+ " is "+(this.rateInterest*this.balance)/(100*12) );
    }

}

