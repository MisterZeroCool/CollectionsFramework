package ru.lesson.list;

import java.util.LinkedList;

//Класс LinkedList реализует интерфейсы List, Dequeue и Queue.Он
// представляет структуру данных связанного списка. В классе LinkedList
// реализуется интерфейс Deque и благодаря этому становится доступным
// методы определённую в интерфейсе Deque.Например чтобы ввести элементы
// в начале списка достаточно вызвать метод addFirst() или offerFirst(), а для
// того чтобы ввести элементы в конец списка - метод addLast или offerLast().
// Чтобы получить первый элемент из списка следует вызвать метод
// getFirst() или peekFirst(), а для того чтобы удалить первый элемент из
// списка метод removeFirst() или pollFirst().И наконец чтобы получить
// последний элемент из списка следует вызвать метод getLast или
// peekLast, а для того чтобы удалить последний элемент списка метод
// removeLast() или pollLast().
//В классе LinkedList реализуется интерфейс List, поэтому в результате
// вызова метода lines.add("J"); элементы вводятся в конце списка
// как и при вызове метода addLast();
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> lines = new LinkedList<>();

        lines.add("e");
        lines.add("l");
        lines.add("l");
        lines.add("o");
        lines.add("f");
        lines.add("o");
        lines.addFirst("h");
        lines.addLast("x");
        lines.add(8,"z6");

        lines.add("J");//элементы вводятся в конце списка

        System.out.println("Содержимое\n"+lines);

        lines.remove("x");
        lines.remove(2);
        System.out.println("Содержимое после удаления\n"+lines);

        lines.removeFirst();
        lines.removeLast();

        System.out.println("Содержимое после удаления первого и второго элеменитов\n"+lines);

        String val = lines.get(2);
        lines.set(2, val + " изменено");

        System.out.println("Содержимое после изменения\n"+lines);


    }
}
