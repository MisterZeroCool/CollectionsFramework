package ru.lesson.comparator.example_1;

import java.util.Comparator;

//В этой программе реализуется метод compare() для сравнения символьных
//строк в порядке, обратном обычному. Это означает что элементы древовидного
//множества сортируются в обратном порядке.
public class MyComp implements Comparator<String> {
    //компаратор для сравнения строк в обратном порядке
    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr =a;
        bStr = b;
        //выполнить сравнение в обратном порядке
        //Метод compareTo() вызывается для строкового
        // объекта bStr, а не для aStr. Благодаря этому
        // результат сравнения получается обратный.
        //Но можно просто вызвать метод reversed() - этот
        // метод возвратит  эквивалентный компаратор.
        return bStr.compareTo(aStr);
    }
}
