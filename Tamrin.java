import java.util.Scanner;
public class Tamrin {

    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.println("Please Enter GreekNumber");

        String x = reader.nextLine();

        int sum = 0;
        for (char ch : x.toCharArray()) {

            int num;
            switch (ch) {
                case 'I' :
                    num=1 ;
                    break;
                case 'V':
                  num=5;
                    break;
                case 'X' :
                    num=10 ;
                    break;
                case 'L' :
                    num=50 ;
                    break;
                case 'C' :
                    num=100 ;
                    break;
                case 'D' :
                    num=500 ;
                    break;
                case 'M' :
                    num=1000 ;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }


            sum += num;

       }

        System.out.println("Your Number is " + sum);



    }
}
