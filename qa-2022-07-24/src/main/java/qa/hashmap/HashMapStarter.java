package qa.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapStarter {

    public static void main(String[] args) {
        Map<Integer, Person> map = new LinkedHashMap<>(); //поменять на TreeMap и LinkedHashMap потом, про использование интерфейса тут сказать
        map.put(1, new Person("Игорь", 35));
        map.put(2, new Person("Виталий", 35));
        System.out.println(map);

        Person person = map.get(1);
        System.out.println(person);

        //замена человека
        map.put(2, new Person("Катя", 35));
        System.out.println(map);

        map.put(6, new Person("Виталий 4", 35));
        map.put(45756, new Person("Виталий 3", 35));
        map.put(-4, new Person("Виталий 2", 35));
        map.put(3, new Person("Виталий 1", 35));
        System.out.println(map);
        //тут дальше показать работу TreeMap и LinkedHashMap

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }

    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
