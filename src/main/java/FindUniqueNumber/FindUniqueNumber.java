package FindUniqueNumber;

import java.util.Arrays;

/**
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * <p>
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * It’s guaranteed that array contains at least 3 numbers.
 * <p>
 * The tests contain some very huge arrays, so think about performance.
 */
public class FindUniqueNumber {

    public static double findUniq(double arr[]) {
        //Сортируем массив
        Arrays.sort(arr);
        //создаем два условия
        // 1) если первое число массива не равно второму, то это и будет искомое число
        if (arr[0] != arr[1]) return arr[0];
        //2) если последнее число массива не равно второму, то это и будет искомое число
        if (arr[arr.length - 1] != arr[1]) return arr[arr.length - 1];
        return 0;
    }

    public static double findUniq2(double arr[]) {
        //Распишем то же самое, но иначе
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
        /**
         * Здесь сначала arr[0] и arr[1] проверяем на их равенство (==, ?)
         * Если значение истинно, то возвращаем arr[arr.length -1]
         * Если ложно (:), то arr[0]
         */
    }


}
