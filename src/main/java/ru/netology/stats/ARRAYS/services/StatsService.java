package ru.netology.stats.ARRAYS.services;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            }

        return sum;
    }

    public long middleValueSales(long[] sales) {
        long sum = sumSales(sales);
        long mid = sum / sales.length;

        return mid;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public long belowMiddleValueSales(long[] sales) {
        long mid = middleValueSales(sales);
        long belowMid = 0;

        for (int i = 0; i < sales.length; i++) {
            if (mid > sales[i]) {
                belowMid = i;
            }
        }

        return belowMid;
    }

    public long overMiddleValueSales(long[] sales) {
        long mid = middleValueSales(sales);
        long overMid = 0;

        for (int i = 0; i < sales.length; i++) {
            if (mid < sales[i]) {
                overMid = i;
            }
        }

        return overMid;
    }
}


