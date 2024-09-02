package ListFiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    /**
     * In this kata you will create a function
     * that takes a list of non-negative integers and strings
     * and returns a new list with the strings filtered out.
     */

    // Метод для фильтрации строк из списка
    public static List<Object> filterList(final List<Object> list) {
        List<Object> numbs = new ArrayList<>();
        // Проходим по всем элементам списка
        for (Object item : list) {

            // Проверяем, является ли элемент целым числом
            if (item instanceof Integer) {
                numbs.add(item);
            }
        }
        return numbs;
    }

    public static List filterList2(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }
}
