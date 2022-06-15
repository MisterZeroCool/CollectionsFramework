package ru.lesson.map;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Данный класс реализует интерфейс Map.  В нём используются
// Хеш таблица для хранения хешированного отображения и
// благодаря этому обеспечивается постоянное время выполнения
// методом get() и put() даже при манипулирование крупными отображе-
// ниями.
// НЕ ГАРАНТИРУЕТ ПОРЯДОК РАСПОЛОЖЕНИЯ СВОИХ ЭЛЕМЕНТОВ.
//Следовательно , порядок, в котором элементы вводятся в Хеш отображение,
// не обязательно соответствует тому порядку, в котором они извлекаются
// итератором.
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Джон Доу", new Double(4343.3));
        hm.put("Алекс Фокс", new Double(123.22));
        hm.put("Дана Уэйд", new Double(5438.74));
        hm.put("Рольф Смит", new Double(1937.8));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //вывести множество записей
        String searchName = "Алекс Фокс";
        String name = "";
        for(Map.Entry<String, Double> me : set) {
            if(me.getKey().equals(searchName))
                name = searchName;
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get(name);
        hm.put(name, balance + 1000);
        System.out.println("Новый остаток на счету " + name+" : " + hm.get(name));
    }
}
