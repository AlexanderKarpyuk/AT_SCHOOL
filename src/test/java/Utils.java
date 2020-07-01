/**
 * Класс утилитя для вывода результатов тестов в консоль.
 */
public class Utils {
    private static int countAllTests;
    private static int countAllFails;

    /**
     * Вывод в консоль результата тестирования одного метода.
     * @param className Имя класса где находится тестируемый метод.
     * @param methodName Имя тестируемого метода.
     * @param countTests Число проведённых тестов.
     * @param countFails Число неудачных тестов.
     */
    protected static void printResult(String className, String methodName, int countTests, int countFails) {
        countAllTests += countTests;
        countAllFails += countFails;

        System.out.println(String.format("Тест метода: %s.%s.", className, methodName));
        System.out.println("Сравние результатов метода с ожидаемыми значениями...");
        if (countFails > 0) {
            System.out.println("Упс... метод отработал не правильно, кому-то придётся это исправлять.");
        } else {
            System.out.println("Всё хорошо, метод работает правильно, можно спать спокойно.");
        }
        System.out.println();
        System.out.println(String.format("Проведено тестов: %d", countTests));
        System.out.println(String.format("Поймано багов: %d %s" , countFails, System.lineSeparator()));
        System.out.println("--------------------------------");
    }

    /**
     * Вывод в консоль результатов всех тестов.
     */
    public static void printFinalResult() {
        System.out.println();
        System.out.println();
        System.out.println("Всего проведено тестов: " + countAllTests);
        System.out.println("Из них закончились неудачей: " + countAllFails);
    }
}
