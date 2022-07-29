package ru.netology.stats;

public class StatService {
    public long allMonth(long[] sales) {
        long allMonth = 0;

        for (long sale : sales) {
            allMonth += sale;
        }

        return allMonth;
    }

    public long average(long[] sales) {
        return allMonth(sales) / 12;
    }

    public int countBelowAvg(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {

            if (sale < avg) {
                count++;
            }

        }
        return count;
    }

    public int countAboveAvg(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {

            if (sale > avg) {
                count++;
            }

        }
        return count;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int i = 0; i < sales.length; i++) {

            if (i <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // подключаем счётчик
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
 
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
}
