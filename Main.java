package MyFourthWork;

import java.util.*;

/*    Created by: Maxim.G, GU_QA_1883

   1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
      Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
      Посчитать, сколько раз встречается каждое слово.
   2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
      В этот телефонный справочник с помощью метода add() можно добавлять записи,
      а с помощью метода get() искать номер телефона по фамилии.
      Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
      тогда при запросе такой фамилии должны выводиться все телефоны.

        * Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
          взаимодействие с пользователем через консоль и т.д).
          Консоль использовать только для вывода результатов проверки телефонного справочника.
*/
public class Main {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet", "lock", "mock", "lock", "fork", "mock", "golf", "lock"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println();

        Set<String> unit = new HashSet<>(Arrays.asList(words));
        System.out.println(unit);
        System.out.println();

        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");

        System.out.println(pb.get());
    }
}