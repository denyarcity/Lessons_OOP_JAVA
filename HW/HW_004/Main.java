package HW.HW_004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IsEven approverEven = new IsEven();
        IsPositive approverPositive = new IsPositive();
        BeginsWith approverBeginsWith = new BeginsWith("F");
        BeginsWithA approverBeginsWithA = new BeginsWithA();

        List<Integer> intList = new ArrayList<>(Arrays.asList(23, -1, 12, 4, 36, -40, 51, 7, 9, -11));
        List<String> stringList = new ArrayList<>(
                Arrays.asList("Avfd", "sdce", "Fvtb", "Acsc", "Rew", "Fvgb", "Yghngh"));

        //! раскомментируйте для корректной работы один из вариантов
        Iterable<Integer> result = filter(intList, approverEven);
        // Iterable<Integer> result = filter(intList, approverPositive); 
        // Iterable<String> result = filter(stringList, approverBeginsWith);
        // Iterable<String> result = filter(stringList, approverBeginsWithA);

        System.out.println(result);

    }

    public static <T> Iterable<T> filter(Iterable<T> collection, IsGood<T> approver) {
        Iterable<T> resultColl = collection;
        Iterator<T> iter = resultColl.iterator();
        while (iter.hasNext()) {
            if (!(approver.isGood(iter.next()))) {
                iter.remove();
            }
        }
        return resultColl;
    }
}