package Package1;

import java.util.*;

public class Cat implements Comparable<Cat> {
    String name;
    int age;
    int cost;

    public Cat(String name, int age, int cost) {
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

    public static void main(String [] args) {
        List cats = new ArrayList<>();

        Cat cat1 = new Cat("Мурка", 10, 100);
        Cat cat2 = new Cat("Мурка", 10, 100);

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        cats.add(new Cat("Мурка", 10, 100));
        cats.add(new Cat("Машка", 2, 150));
        cats.add(new Cat("Мурка", 10, 100));
        cats.add(new Cat("Шишка", 12, 80));
        cats.add(new Cat("Фишка", 4, 700));
//Будет ошибка
//        cats.add("Kot");

        Collections.sort(cats);

//        for(Cat ss : cats)
//            System.out.println(ss);
//
//        Collections.sort(cats, new MyComparator());
//
//        for(Cat ss : cats)
//            System.out.println(ss);
//
//        Set<Cat> list = new HashSet<>(cats);

//        System.out.println(cats.size() + " " + list.size());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, price: %d$", this.name, this.age, this.cost);
    }

    @Override
    public int hashCode() {
        int PPP = Objects.hash(2);
        System.out.println(PPP);
        System.out.println(Objects.hash(name, age, cost) + " " + Objects.hash(age, cost, name));
        return Objects.hash(name, age, cost);
    }

    //Можно оставить только name и age, но обязательно и в HashCode и в Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                cost == cat.cost &&
                Objects.equals(name, cat.name);
    }
}
