package ru.lesson.iterator;

import java.util.ArrayList;
//Если не требуется видоизменять содержимое коллекции или извлекть
// из нее элементы в обратном порядке, то лучше использовать цикл foreach
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.println("Исходное содержимое списочног массива vals: ");
        for(int i: vals) System.out.print(i + " ");
        System.out.println();

        int sum = 0;
        for(int v : vals) {
            sum += v;
        }
        System.out.println("Сумма числовых значений: " + sum);
    }
}
