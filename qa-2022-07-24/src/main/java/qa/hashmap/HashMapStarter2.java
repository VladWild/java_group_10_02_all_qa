package qa.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapStarter2 {

    public static void main(String[] args) {
        Map<Person, Car> personCarHashMap = new HashMap<>();

        Person person = new Person("Виталий", 35);
        personCarHashMap.put(person, new Car("Lada Granta"));
        personCarHashMap.put(new Person("Катя", 24), new Car("Mazda"));
        personCarHashMap.put(person, new Car("Lada Priora"));

        System.out.println(personCarHashMap);
        System.out.println(personCarHashMap.get(new Person("Виталий", 35)));
    }

    public final static class Person {
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

    public static class Car {
        private String model;

        public Car(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }
}
