package ru.lesson.comparator.example_2;

import java.util.Comparator;

//Рассмотрим более полезное применение компараторов сортировка
// в программе по фамилии. Для этого в ней используется компаратор,
// сравнивающий фамилии каждого вкладчика. В итоге получаем
// отображение, отсортированные по фамилиям вкладчиков.
public class TComp implements Comparator<String > {
    @Override
    public int compare(String o1, String o2) {
        int i, j, k;
        //найти индекс символа с которого начинается фамилия
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j));
        if(k == 0)  //Фамилии совпадают, проверить имя и фамилию полностью
            return o1.compareTo(o2);
        else return k;
    }
}
