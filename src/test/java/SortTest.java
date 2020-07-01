import java.util.Arrays;

/**
 * Тесты для класса Sort.
 */
public class SortTest extends Utils {
    private final static String className = "SortTest";

    /**
     * Основной метод, вызывает все тестовые методы своего класса.
     */
    public static void testSort() {
        reverseSortTest();
    }

    private static void reverseSortTest() {
        int[] array1 = new int[] {54, 12, 70, 12, 5, 110, 8, 89, 0, -7};
        int[] array2 = new int[] {54, 12, 70, 12, 5, 110, 8, 89, 0, -7};

        boolean result;
        int countTests = 0;
        int countFails = 0;
        String methodName = "reverseSortTest";
        int[] arrayTest = Sort.reverseSort(array1);
        int[] arrayReverse = reverseSort(array2);

        /*Сравнение массива полученного в результате правильной сортировки и
        массива полученного с помощью тестируемого метода, ожидаемое значение: true*/
        result = Arrays.equals(arrayReverse, arrayTest);
        countTests++;
        if (!result) {
            countFails++;
        }

        printResult(className, methodName, countTests, countFails);
    }

    //Сортировка пузырьком в обратном порядке
    private static int[] reverseSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
