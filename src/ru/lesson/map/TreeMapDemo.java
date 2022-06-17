package ru.lesson.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//Создаётся отображение в древовидной структуре.  В классе TreeMap
// предоставляется эффективное средство для хранения пар ключ-значение
// в отсортированном порядке и обеспечивается их быстрое излечение.
// гарантирует что элементы будут отсортированы по порядку нарастания
// ключей.
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Дана Доу", new Double(4343.3));
        tm.put("Марта Фокс", new Double(11453.22));
        tm.put("Дана Уэйд", new Double(-48.74));
        tm.put("Рудольф Смит", new Double(157.2));
        tm.put("Аманда Рипли", new Double(10000.2));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        String searchName = "Рудольф Смит";
        String name = "";
        for(Map.Entry<String, Double> me : set) {
            if(me.getKey().equals(searchName)){
                name = searchName;
            }
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //изменение остатка на счете
        double balance = tm.get(name);
        tm.put(name,balance + 1000);
        System.out.println("Новый остаток на счету " + name+" : " + tm.get(name));
    }
}
