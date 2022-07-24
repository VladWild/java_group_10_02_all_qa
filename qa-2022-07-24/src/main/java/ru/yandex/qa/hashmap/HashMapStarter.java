package ru.yandex.qa.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStarter {

    public static void main(String[] args) {
        Map<String, Person> personHashMap = new HashMap<>();
        personHashMap.put("Вася", new Person("Василий", 28));
        personHashMap.put("Игорь", new Person("Игорь", 56));
        System.out.println(personHashMap);

        Person person = personHashMap.get("Вася");
        System.out.println(person);

        Person person2 = personHashMap.put("Вася", new Person("Василий", 29));

        System.out.println(personHashMap);

        Person person1 = personHashMap.get("Ва*");
        System.out.println(person1);

        System.out.println("----------------------------");
        Set<String> strings = personHashMap.keySet();
        System.out.println(strings);
        Collection<Person> values = personHashMap.values();
        System.out.println(values);

        System.out.println("----------------------------");
        Set<Map.Entry<String, Person>> entries = personHashMap.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            entry.getKey();
            entry.getValue();
            System.out.println(entry.getKey() + "   =    " + entry.getValue());
        }
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
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
