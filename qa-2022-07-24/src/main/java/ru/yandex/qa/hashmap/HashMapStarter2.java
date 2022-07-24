package ru.yandex.qa.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapStarter2 {

    public static void main(String[] args) {
        Map<Integer, Object> hashMap = new TreeMap<>();

        hashMap.put(1, new Person("Катя", 20));
        hashMap.put(-3443, new Person("Катя 2", 20));
        hashMap.put(343545, new Person("Катя 3", 20));
        hashMap.put(Integer.MAX_VALUE, new Person("Катя 4", 20));
        hashMap.put(Integer.MIN_VALUE, new Person("Катя 5", 20));
        hashMap.put(0, new Person("Катя 6", 20));

        System.out.println(hashMap);
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
