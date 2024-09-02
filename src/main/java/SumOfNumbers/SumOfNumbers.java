package SumOfNumbers;

//Given two integers a and b,
// which can be positive or negative,
// find the sum of all the integers between and including them and return it.
// If the two numbers are equal return a or b.
//
//Note: a and b are not ordered!

// по сути эта задача про арифметическую прогрессию
public class SumOfNumbers {
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }

        //Определяем Максимум и Минимум для применения формулы
        // нахождения разности арифметической прогрессии
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        //Находим количество членов арифметической прогрессии

        int n = max - min + 1;

        // Вычисляем сумму по соответствующей формуле

        return ((min + max) * n) / 2;

    }

    public int GetSum2(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        }
        //Определяем Максимум и Минимум для применения формулы
        // нахождения разности арифметической прогрессии
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        //Суммируем все числа от min до max включительно
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

}

