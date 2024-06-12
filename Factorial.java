import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Please Enter Number");

        int num=reader.nextInt();
        System.out.println("Factorial Your Number is " +factorial(num));
    }

    public static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
            }
            else{
                return 1;
            }
            }

    }
