public class Utils {
    public static void printResult(String className, String methodName, boolean result) {
        System.out.println(String.format("Тест метода: %s.%s.", className, methodName));
        System.out.println("Сравние результата метода с ожидаемым значением...");
        if (result) {
            System.out.println("Всё хорошо, метод работает правильно, можно спать спокойно.");
        } else {
            System.out.println("Упс... метод отработал не правильно, кому-то придётся это исправлять.");
        }
        System.out.println("--------------------------------");
    }
}
