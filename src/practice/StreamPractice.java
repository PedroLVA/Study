package practice;

import java.util.*;
import java.util.stream.*;

public class StreamPractice {

    public static class Person {
        private String name;
        private int age;
        private String country;

        public Person(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        // Getters
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getCountry() { return country; }

        @Override
        public String toString() {
            return name + " (" + age + ") from " + country;
        }
    }

    // Static method with sample data
    public static List<Person> getPeople() {
        return List.of(
                new Person("Alice", 25, "USA"),
                new Person("Bob", 30, "UK"),
                new Person("Charlie", 20, "USA"),
                new Person("Diana", 22, "Canada"),
                new Person("Ethan", 35, "UK"),
                new Person("Fiona", 18, "Australia")
        );
    }

    public static void main(String[] args) {
        List<Person> people = getPeople();

        System.out.println("Age above 25: " + people.stream()
                .filter(person -> person.getAge() > 25)
                .toList());

        System.out.println("Country USA: " + people.stream().filter(person -> person.getCountry().equals("USA")).toList());
        System.out.println("Name start with A: " + people.stream().filter(person -> person.getName().toLowerCase().startsWith("a")).toList());
        System.out.println("Between 20 and 30: " + people.stream().filter(person -> person.getAge() <=30 && person.getAge() >= 20).toList());

        //map
        System.out.println("\n*************************\n");

        System.out.println("Only name: " +people.stream().map(Person::getName).toList());

        System.out.println("UK uppercase: " +people.stream().
                filter(person -> "UK".equals(person.getCountry()))
                .map(person -> person.getName().toUpperCase()).toList());

        System.out.println("<NAME> is from <COUNTRY>" +
                people.stream().map(person -> person.getName() + " is from " + person.getCountry() ).toList());

        System.out.println("\n*************************\n");

        //comparator
        var byAge = people.stream().sorted(Comparator.comparingInt(Person::getAge)).toList();
        System.out.println("Sort by age: " + byAge);

        var byCountryAndAge = people.stream().sorted(Comparator.comparing(Person::getCountry).thenComparingInt(Person::getAge)).toList();
        System.out.println("Sort by age and country: " + byCountryAndAge);

        var byCountryAndAge2 = people.stream().sorted(Comparator.comparingInt((Person p) -> p.getName().length()).thenComparing(Person::getName)).toList();
        System.out.println("Sort by age and country: " + byCountryAndAge);

        var byNameLength = people.stream().sorted((o1, o2) -> {
          int length1 = o1.getName().length();
          int length2 = o2.getName().length();

          if(length1 != length2){
              return length1 - length2;
          }
          return 0;

        }).toList();

        System.out.println("Sort by name length: " + byNameLength);


    }
}