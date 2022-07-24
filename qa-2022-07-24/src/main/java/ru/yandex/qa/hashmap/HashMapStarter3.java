package ru.yandex.qa.hashmap;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapStarter3 {

    public static void main(String[] args) {
        Map<Person, String> personStringHashMap = new HashMap<>();

        Person person = new Person("Игорь", 30, LocalDateTime.now());
        personStringHashMap.put(person, "Игорь");

        Person person2 = new Person("Катя", 23, LocalDateTime.now());
        personStringHashMap.put(person2, "Екатерина");

        System.out.println(personStringHashMap);

        String игорь = personStringHashMap.get(new Person("Игорь", 30, LocalDateTime.now()));
        System.out.println(игорь);


    }

    public final static class Person {
        private final String name;
        private final int age;
        private final LocalDateTime localDateTime;

        public Person(String name, int age, LocalDateTime localDateTime) {
            this.name = name;
            this.age = age;
            this.localDateTime = localDateTime;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public LocalDateTime getLocalDateTime() {
            localDateTime.getMinute();
            localDateTime.getHour();
            return LocalDateTime.now();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
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
