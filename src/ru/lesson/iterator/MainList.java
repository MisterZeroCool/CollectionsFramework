package ru.lesson.iterator;

import java.util.LinkedList;
//Сохраняем наши объекты в коллекции
//В классе Address переопределен метод toSting(),
// по этому элементы выводятся именно так
public class MainList {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<>();
        addresses.add(new Address("J.W. West","11 Oak Ave","Urbana","IL","61801"));
        addresses.add(new Address("D.S. Fox","12 Daf Oxe","Barana","GD","55801"));
        addresses.add(new Address("A.V. Jax","1 Cas Rok","Alabama","LL","77801"));

        for(Address element : addresses) {
            System.out.println(element + "\n ");
        }
        System.out.println();


    }
}
