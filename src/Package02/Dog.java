package Package2;

public class Dog {
    Person owner;
    int age;
    String name;

    public Dog(Person owner, int age, String name) {
        this.owner = owner;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "owner=" + owner +
                ", age=" + age +
                ", name=" + name + " ";
    }
}
