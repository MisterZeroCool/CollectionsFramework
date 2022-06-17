package ru.lesson.list;

import java.util.ArrayList;
//Классы ArrayList расширяет класс AbstractList и реализует интерфейс List.
//В классе ArrayList поддерживается динамические массивы которые могут
// наращиваться по мере надобности.
//Arraylist может динамически расширяться и уменьшаться
//Недостатки массивов:  фиксированная длина, медленное удаление


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> text_a = new ArrayList<>();
        System.out.println("Начальный размер списочного массива text_a "
                + text_a.size());
        text_a.add("S");
        text_a.add("A");
        text_a.add("S");
        text_a.add("A");
        text_a.add("A");
        text_a.add("F");
        text_a.add(4,"B");
        System.out.println("Размер списочного массива text_a после ввода элементов "
                + text_a.size());
        System.out.println("Вывести содержание списочного массива text_a : " +text_a);

        text_a.remove("F");
        text_a.remove(5);
        text_a.remove(4);

        System.out.println("Размер списочного массива text_a после удаления элементов "
                + text_a.size());

        System.out.println("Вывести содержание списочного массива после удаления text_a : " +text_a);

//        При обработке списочного массива ArrayList иногда необходимо получить обычный массив,
//        содержащий все элементы списка. Это можно сделать вызвав мотод:
//         toArray() - возвращает массив объектов типа Object
//         toArray(T array[]) - возвращает массив элементов, относящихся к типу Т

//        Имеется несколько причин по которым возникает потребность преобразовать коллекцию в массив:
//        -Ускорение выполнения некоторых операций
//        -Передача массива в качестве параметра методам, которые не перегружаются,
//        чтобы принимать коллекцию непосредственно

        //получить обычный массив
        String[] strings = new String[text_a.size()];
        strings = text_a.toArray(strings);

        String word = "";
        for(String s : strings) {
            word += s;
        }
        System.out.println(word);
    }
}
