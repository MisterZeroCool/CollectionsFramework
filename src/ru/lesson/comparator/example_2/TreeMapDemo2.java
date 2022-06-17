package ru.lesson.comparator.example_2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>(new TComp());

        treeMap.put("Даша Доу", new Double(4343.3));
        treeMap.put("Мари Смит", new Double(11453.22));
        treeMap.put("Дэйзи Уэйд", new Double(- 48.74));
        treeMap.put("Руф Смит", new Double(157.2));
        treeMap.put("Аманда Рипли", new Double(10000.2));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        String searchName = "Руф Смит";
        String name = "";
        for(Map.Entry<String, Double> me : set) {
            if(me.getKey().equals(searchName)) {
                name = searchName;
            }
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //изменение остатка на счете
        double balance = treeMap.get(name);
        treeMap.put(name, balance + 1000);
        System.out.println("Новый остаток на счету " + name + " : " + treeMap.get(name));
    }
}
