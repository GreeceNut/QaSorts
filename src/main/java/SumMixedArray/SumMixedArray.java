package SumMixedArray;

import java.util.List;

/**
 * Given an array of integers as strings and numbers,
 * return the sum of the array values as if all were numbers.
 * <p>
 * Return your answer as a number.
 */
public class SumMixedArray {

    public int sum1(List<?> mixed) {
        int sum = 0;
        // Проходимся по каждому элементу объекта
        for (Object element : mixed) {
            // Сравниваем каждый элемент на его тип String.
            // Если тип объекта совпадает, то парсируем в int
            // И находим сумму этих эелементов
            if (element instanceof String) {
                sum += Integer.parseInt((String) element);
                // Если тип объекта соответствует обертке Integer
                // Суммируем эти элементы
            }
            if (element instanceof Integer) {
                sum += (Integer) element;
            }
        }
        return sum;
    }


    public int sum2(List<?> mixed) {
        return mixed
                .stream()
                .mapToInt(o -> Integer.parseInt(o.toString()))
                .sum();
    }

    public int sum(List<?> mixed) {

        int sum = 0;
        // Проходимся по каждому элементу объекта
        for (Object s : mixed) {
            // Сначала преобразуем каждый объект в String
            // Затем парсируем в int
            // После находим сумму
            sum += Integer.parseInt(s.toString());
        }

        return sum;
    }
}
