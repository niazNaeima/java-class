import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Please Enter Number");
        int x=reader.nextInt();
        int num=x/2+1;
        boolean bool=true;
        if (x<1){
            System.out.println("Insert Correct Number");
        }else if (x==1||x==2){
            System.out.println("Your Number Is Prime");
        }else{
            while (num>1){
                int result=x%num;
                if (result==0){
                    bool=false;
                    System.out.println("Your Number Is Not Prime");
                    break;
                    }else{
                    num--;
                }
                } if (bool){System.out.println("Your Number Is Prime");
            }
            }
        }
    }

