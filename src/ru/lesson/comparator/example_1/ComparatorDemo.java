package ru.lesson.comparator.example_1;

import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyComp());
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
