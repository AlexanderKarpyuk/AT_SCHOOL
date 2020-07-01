/**
 * Основной тестовый класс, запускает тесты и выводит результат.
 */
public class Test {
    public static void main(String[] args) {
        CompareObjectsTest.testCompareObjects();
        MapTest.testMap();
        SortTest.testSort();
        Utils.printFinalResult();
    }
}
