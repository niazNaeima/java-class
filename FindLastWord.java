import java.util.Scanner;

public class FindLastWord {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Please Enter Sentence");
        String str = reader.nextLine();
        int lengthLastWord=0;
        boolean oneSentence=true;

            for (int i=str.length();i>0;i--){

                String str1=str.substring(i-1,i);
                if (str1.equals(" ")){
                    lengthLastWord=(str.substring(i,str.length())).length();
                    oneSentence=false;
                    break;
                }

            } if (!oneSentence){
                System.out.println("Length Of Last Word is " + lengthLastWord);

            } else {
                System.out.println("This is not the sentence and includes a word to a length of " + str.length());
        }

        }
}
