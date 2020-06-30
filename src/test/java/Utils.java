public class Utils {
    private static int count;

    protected static void printResult(String className, String methodName, int countTests, int countFails) {
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
}
