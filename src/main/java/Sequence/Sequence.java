package Sequence;

public class Sequence {


    public static int[] reverse(int n) {
        // создаём массив размером n
        int[] temp = new int[n];
        // заполняем его числами от n до 1
        for (int i = 0; i < n; i++) {
            temp[i] = n - i;
        }
        // возвращаем массив
        return temp;
    }
}

