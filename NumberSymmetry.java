import java.util.Scanner;

public class NumberSymmetry {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Please Enter Number");
        int num=reader.nextInt();
        int orgNum=num;
        int rev=0;

        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        } if (orgNum==rev){
            System.out.println("Your Number Is Symmetrycal");
        }else {System.out.println("Your Number Is Not Symmetrycal");

        }
    }
}
