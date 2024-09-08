public class Elevator {

    // Метод для подсчета количества подъемов, необходимых лифту для достижения верхнего этажа
    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;  // Лифт начинает с 0-го этажа
        int lifts = 0;         // Счетчик подъемов

        // Пока лифт не достиг или не превысил последний этаж
        while (currentFloor < floor) {
            lifts++; // Считаем подъем
            currentFloor += stepUp; // Подъем лифта

            // Проверка: если лифт достиг или превысил последний этаж, выходим из цикла
            if (currentFloor >= floor) {
                break;
            }

            // Если лифт не достиг последнего этажа, спускаемся на M этажей
            currentFloor -= stepDown;
        }

        return lifts; // Возвращаем количество подъемов
    }

    public static void main(String[] args) {
        int H = 200;  // Высота здания (целевой этаж)
        int N = 50;   // Подъем лифта за один раз
        int M = 1;    // Спуск лифта за один раз

        // Подсчет количества подъемов
        int result = numberOfLifts(H, N, M);

        // Вывод результата
        System.out.println("Количество подъемов, необходимых для достижения верхнего этажа: " + result);
    }
}
