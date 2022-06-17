package ru.lesson.comparator.example_1;

import java.util.Comparator;

//Улучшим предыдущий пример
public class MyComp2 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
