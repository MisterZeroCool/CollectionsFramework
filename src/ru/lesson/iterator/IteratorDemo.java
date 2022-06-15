package ru.lesson.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Прежде чем обратиться к коллекции через итератор, следует
// получить его. В каждом классе коллекции предоставляется
// метод итератор, возвращающий итератор на начало коллекции.
// Используя объект итератора можно получить доступ к
// каждому элементу коллекции по очереди. В общем применение
// итерактора для перебора содержимого коллекции сводится к
// выполнению следующих действий.
// 1. установить итератор в
// начало коллекции получив его из метода iterator() вызываемого
// для коллекций.
// 2. организовать цикл, в котором вызывается
// метод hasNext(). Перебирать содержимое коллекции до тех пор
// пока метод hasNext() возвращает логическое значение true.
// 3. получить в цикле Каждый элемент коллекции вызывая метод next().
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("H");

        System.out.println("Исходное содержимое списочного массива arrayList: ");
        Iterator<String> itr = arrayList.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //видоизменить перебираемые объекты
        ListIterator<String> lItr = arrayList.listIterator();
        while(lItr.hasNext()){
            String element = lItr.next();
            lItr.set(element + "+");
        }

        System.out.println("Измененное содержимое списочного массива arrayList: ");
        itr = arrayList.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //а теперь отобразить список в обратном порядке
        System.out.println("Измененный в обратном порядке список: ");
        while(lItr.hasPrevious()){
            String element = lItr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
