package ru.lesson.comparator.example_1;

import java.util.TreeSet;

//На самом деле создавать класс MyComp2 фактически не требуется,
// поскольку его можно заменить соответствующим лямбда-выражением.

//Использовать лямбда-выражение для создания коморатора с обратным
// упорядочеванием
public class ComparatorDemo3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>((aStr, bStr)-> bStr.compareTo(aStr));

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("F");
        treeSet.add("E");

        for(String element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
