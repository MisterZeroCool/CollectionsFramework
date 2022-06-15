package ru.lesson.set;

import java.util.LinkedHashSet;

//Данный класс расширяет класс HashSet, не добовляя никаких методов.
//У этого класса такие же конструкторы как и у HashSet.
//В классе поддерживется связанный список элементов хэщ множества
// в том порядке, в каком они введены в него. Это позволяет организовать
//итерацию с вводом элементов в определенном порядке.
//Следовательно, я когда перебор элементов множества типа LinkedHashSet
// производится с помощью итератора элементы извлекаются из этого
// множества в том порядке в каком они были введены. Именно в этом
// порядке они будут также возвращены методом toString, вызываемым
// для объекта типа LinkedHashSet.
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("фа");
        linkedHashSet.add("та");
        linkedHashSet.add("Ом");
        linkedHashSet.add("Га");
        linkedHashSet.add("Эт");

        int size = linkedHashSet.size();
        System.out.println("Размер " + size+" \nсодержимое "+ "\n"+linkedHashSet); //выводится в разном порядке


        linkedHashSet.remove("та");
        size = linkedHashSet.size();
        System.out.println("Размер " + size+" \nсодержимое "+ "\n"+linkedHashSet); //выводится в разном порядке
    }
}
