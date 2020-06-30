import java.util.HashMap;

public class MapTest extends Utils {
    private final static String className = "MapTest";
    private static HashMap<String, String> map = new HashMap<>();

    static {
        map.put("key1", "string");
        map.put("key2", "string");
    }

    public static void testMap() {
        countElementsInMapTest();
        deleteValueFromMapTest();
    }

    private static void countElementsInMapTest() {
        int countTests = 0;
        int countFails = 0;
        boolean result;
        String methodName = "countElementsInMap()";

        //Вызов метода с корректными параметрами, ожидаемый результат: 3
        result = Map.countElementsInMap("Ерохин", "Сергей") == 3;
        countTests++;
        if (!result) {
            countFails++;
        }

        //Вызов метода с параметрами к которым добавлены пробелы, ожидаемый результат: 3
        result = Map.countElementsInMap("Ерохин ", "Сергей ") == 3;
        countTests++;
        if (!result) {
            countFails++;
        }

        //Вызов метода с параметрами null, ожидаемый результат: 0
        result = Map.countElementsInMap(null, null) == 0;
        countTests++;
        if (!result) {
            countFails++;
        }

        printResult(className, methodName, countTests, countFails);
    }

    public static void deleteValueFromMapTest() {
        int countTests = 0;
        int countFails = 0;
        boolean result;
        String methodName = "deleteValueFromMapTest()";

        //Вызов метода с передачей Map содержащей одиковымые value, ожидаемый результат: 0
        try {
            result = Map.deleteValueFromMap(map, "string").size() == 0;
            if (!result) {
                countFails++;
            }
        } catch (Exception e) {
            countFails++;
        } finally {
            countTests++;
        }

        printResult(className, methodName, countTests, countFails);
    }
}
