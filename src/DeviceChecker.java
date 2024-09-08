public class DeviceChecker {

    // Метод для проверки корректности работы устройства
    public static boolean isDeviceWorking(int temperature1, int temperature2) {
        // Устройство работает корректно, если температура первой колбы больше 100,
        // а температура второй колбы меньше 100
        return temperature1 > 100 && temperature2 < 100;
    }

    public static void main(String[] args) {
        // Пример использования метода
        int temperature1 = 150; // Температура первой колбы
        int temperature2 = 50;  // Температура второй колбы

        // Проверка работы устройства
        boolean result = isDeviceWorking(temperature1, temperature2);

        // Вывод результата
        System.out.println("Устройство работает корректно: " + result);
    }
}
