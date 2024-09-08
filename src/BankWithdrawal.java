public class BankWithdrawal {

    // Метод для подсчета дней, необходимых для снятия всех денег
    public static int countWithdrawalDays(int N) {
        int days = 0;

        // Пока сумма на счету больше нуля, продолжаем снимать деньги
        while (N > 0) {
            // Если N равно 1, то можно снять последние деньги
            if (N == 1) {
                N -= 1;
            } else {
                // Ищем максимальный делитель N, который меньше N
                int maxDivisor = 1; // Минимальный делитель
                for (int i = 1; i <= N / 2; i++) {
                    if (N % i == 0) {
                        maxDivisor = i;
                    }
                }
                N -= maxDivisor;
            }
            days++;
        }

        return days;
    }

    public static void main(String[] args) {
        int N = 21; // Начальная сумма на счету
        int days = countWithdrawalDays(N); // Подсчет количества дней для снятия всех денег

        System.out.println("Количество дней, необходимых для снятия всех денег: " + days);
    }
}
