package Package3;

public class Dog extends Pet{
    Person owner;
    int age;
    String name;

    public Dog(Person owner, int age, String name) {
        this.owner = owner;
        this.age = age;
        this.name = name;
    }

    public Dog(int age, String name) {
        this.owner = null;
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
