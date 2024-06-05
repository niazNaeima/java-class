import java.util.* ;
import java.util.Scanner;
public class Tamrin2 {


    public static void main(String[] args) {

        Map<Character, Integer> greekToNumber = new HashMap<>();
        greekToNumber.put('I', 1);
        greekToNumber.put('V', 5);
        greekToNumber.put('X', 10);
        greekToNumber.put('L', 50);
        greekToNumber.put('C', 100);
        greekToNumber.put('D', 500);
        greekToNumber.put('M', 1000);

        Scanner reader=new Scanner(System.in);
        System.out.println("Please Enter GreekNumber");

        String x = reader.nextLine();

        int sum = 0;
        for (char ch : x.toCharArray()) {
        if (greekToNumber.containsKey(ch)) {
        sum += greekToNumber.get(ch);
        }
        }
        System.out.println("Your Number is " + sum);
        }
        }