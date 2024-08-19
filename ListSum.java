import java.util.ArrayList;
import java.util.List;

public class ListSum<T> {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(6);
        List<Double> list2 = new ArrayList<>();
        list2.add(2.3);
        list2.add(3.8);
        list2.add(4.6);
        list2.add(5.1);

        List<Double> result = sumLists(list1, list2);
        System.out.println("Result: " + result);
    }

    public static <T extends Number,T1 extends Number> List<Double> sumLists(List<T> list1, List<T1> list2) {
        List<Double> result = new ArrayList<>();
        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i).doubleValue() + list2.get(i).doubleValue());
        }

        return result;
    }


}

