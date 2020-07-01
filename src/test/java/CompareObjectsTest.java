import java.util.ArrayList;
import java.util.List;

/**
 * Тесты для класса CompareObjects.
 */
public class CompareObjectsTest extends Utils {
    private static List<Object> objects;
    private final static String className = "CompareObjectsTest";

    static {
        objects = new ArrayList<>();
        objects.add(new TestObject("Дима"));
        objects.add(new TestObject("Володя"));
        objects.add(new TestObject("Володя"));
        objects.add(null);
    }

    /**
     * Основной метод, вызывает все тестовые методы своего класса.
     */
    public static void testCompareObjects() {
        compareTest();
        compareToStringTest();
        compareHashCode();
    }

    private static void compareTest() {
        int countTests = 0;
        int countFails = 0;
        boolean result;
        String methodName = "compare()";

        //Сравнение обьекта с самим собой, ожидаемое значение: true
        result = CompareObjects.compare(objects.get(0), objects.get(0));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение с другим обьектом того же класса и разными полями, ожидаемое значение: false
        result = !CompareObjects.compare(objects.get(0), objects.get(1));
        countTests++;
        if (!result) {
            countFails++;
        }


        //Сравнение разных обьектов одного класса, с одинаковыми полями, ожидаемое значение: true
        result = CompareObjects.compare(objects.get(1), objects.get(2));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение обьекта с null, ожидание результата: false
        result = !CompareObjects.compare(objects.get(0), objects.get(3));
        countTests++;
        if (!result) {
            countFails++;
        }

        printResult(className, methodName, countTests, countFails);
    }

    private static void compareToStringTest() {
        int countTests = 0;
        int countFails = 0;
        boolean result;
        String methodName = "compareToString()";

        //Сравнение обьекта с самим собой, ожидаемое значение: true
        result = CompareObjects.compare(objects.get(0), objects.get(0));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение с другим обьектом того же класса и разными полями, ожидаемое значение: false
        result = !CompareObjects.compare(objects.get(0), objects.get(1));
        countTests++;
        if (!result) {
            countFails++;
        }


        //Сравнение разных обьектов одного класса, с одинаковыми полями, ожидаемое значение: false
        result = !CompareObjects.compare(objects.get(1), objects.get(2));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение обьекта с null, ожидание результата: false
        result = !CompareObjects.compare(objects.get(0), objects.get(3));
        countTests++;
        if (!result) {
            countFails++;
        }

        printResult(className, methodName, countTests, countFails);
    }

    private static void compareHashCode() {
        int countTests = 0;
        int countFails = 0;
        boolean result;
        String methodName = "compareHashCode()";

        //Сравнение обьекта с самим собой, ожидаемое значение: true
        result = CompareObjects.compare(objects.get(0), objects.get(0));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение с другим обьектом того же класса и разными полями, ожидаемое значение: false
        result = !CompareObjects.compare(objects.get(0), objects.get(1));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение разных обьектов одного класса, с одинаковыми полями, ожидаемое значение: false
        result = !CompareObjects.compare(objects.get(1), objects.get(2));
        countTests++;
        if (!result) {
            countFails++;
        }

        //Сравнение обьекта с null, ожидание результата: false
        result = !CompareObjects.compare(objects.get(0), objects.get(3));
        countTests++;
        if (!result) {
            countFails++;
        }

        printResult(className, methodName, countTests, countFails);
    }

    private static class TestObject {
        public String name;

        public TestObject(String name) {
            this.name = name;
        }
    }
}
