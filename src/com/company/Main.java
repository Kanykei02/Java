package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            array.add(i);
        }
        System.out.println(array);
        Set<Integer> hashSet = new HashSet<>(array);
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                hashSet.add(i);
            }
        }
        System.out.println(hashSet);
        //Операции над множеством
        //
        //С множеством можно делать только три операции: добавлять элементы во множество, удалять элементы из множества и проверять, есть ли во множестве определенный элемент. Все.
        //
        //Отсутствие порядка
        //
        //У элементов этой коллекции нет номеров. Нельзя получить элемент по его индексу или записать значение в коллекцию по определенному индексу. Методов get() и set() у множества нет.
    }
}
