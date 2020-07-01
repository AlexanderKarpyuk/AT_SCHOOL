import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SortTest extends Utils {
    private static List<Integer> list = new ArrayList<>();

    static {
        for (int i = 0; i < 12; i++) {
            int random = (int) (Math.random() * 100);
            list.add(random);
        }

    }

    /**
     * Основной метод, вызывает все тестовые методы своего класса.
     */
    public static void testSort() {
        reverseSortTest();
    }

    private static void reverseSortTest() {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Sort.reverseSort(array);
    }
}
