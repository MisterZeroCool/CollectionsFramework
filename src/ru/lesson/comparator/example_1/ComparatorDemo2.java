package ru.lesson.comparator.example_1;

import java.util.TreeSet;
//В данном примере применяется метод reversed().
//Когда требуется создать компараторы с естественным и
// обратным упрядочением, метод reversed() упрощает
// получение компаратора с обратным упорядочением, не
// требуя написания дополнительного кода специально
// для этой цели.
public class ComparatorDemo2 {
    public static void main(String[] args) {
        MyComp2 myComp2 = new MyComp2();
        TreeSet<String> treeSet = new TreeSet<>(myComp2.reversed());

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
