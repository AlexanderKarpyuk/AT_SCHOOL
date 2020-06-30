import java.util.ArrayList;
import java.util.List;

public class CompareObjectsTest extends Test {
    private static List<Object> objects;
    private static boolean result;

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

    }

    private static void compareTest() {
        //Сравнение обьекта с самим собой, ожидаемое значение: true
        result = CompareObjects.compare(objects.get(0), objects.get(0));
    }

    private static class TestObject {
        public String name;

        public TestObject(String name) {
            this.name = name;
        }
    }
}
