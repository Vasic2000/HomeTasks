package Package02;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Person("Smit", 150);
        Person women1 = new Person("Smitty", 71);
        Person man2 = new Person("Bob", 101);

        Dog dog1 = new Dog(man1, 10, "Bobik");
        Dog dog2 = new Dog(man1, 9, "Tobik");
        Dog dog3 = new Dog(women1, 12, "Gulka");
        Dog dog4 = new Dog(women1, 13, "Tulka");

        Map<Person, Dog> myMap = new HashMap<>();
        myMap.put(dog1.owner, dog1);
        myMap.put(dog2.owner, dog2);
        myMap.put(dog3.owner, dog3);
        myMap.put(dog4.owner, dog4);

        for(Map.Entry<Person, Dog> onePair : myMap.entrySet()){
            System.out.println(String.format("Person: %s, dog: %s", onePair.getKey(), onePair.getValue()));
        }

        System.out.println();

        Map<Person, Dog> mySecondMap = new TreeMap<>(myMap);

        for(Map.Entry<Person, Dog> onePair : mySecondMap.entrySet()){
            System.out.println(String.format("Person: %s, dog: %s", onePair.getKey(), onePair.getValue()));
        }
    }
}
