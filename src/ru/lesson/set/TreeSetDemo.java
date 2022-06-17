package ru.lesson.set;

import java.util.TreeSet;

//Класс TreeSet расширяет класс AbstractSet и реализует
// интерфейс NavigableSet. Он создаёт коллекцию где для
// хранения элементов применяется древовидная структура
// объекты сохраняются в отсортированном порядке по
// нарастающей. время доступа и извлечения элементов
// достаточно мало , благодаря чему класс TreeSet оказывается
// отличным выбором для хранения больших объемов
// отсортированных данных, которые должны быть быстро
// найдены. Становятся доступны методы из NavigableSet.
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("S");
        ts.add("A");
        ts.add("F");
        ts.add("D");
        ts.add("B");

        System.out.println(ts);
        //данный метод выводит последовательность от
        // элемента "B"(включительно) до "S" элемента (Не включительно)
        System.out.println(ts.subSet("B","S"));
    }
}
