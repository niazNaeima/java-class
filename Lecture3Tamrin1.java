public class Lecture3Tamrin1 {
    public static void main(String[] args) {
        String str3=String.format("My name is %s and my age is %s","Niaz",35);
        String str4= str3.toUpperCase();
        String str5=str4.replace("NIAZ","Fanap");
        String str6=str5.substring(0,str5.indexOf('F') +"Fanap".length());
        String str7=str6.toLowerCase();
        System.out.println(str7);

    }
}
