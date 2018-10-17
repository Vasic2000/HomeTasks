package Package3;

import java.util.ArrayList;
import java.util.List;
//  public class Node<T extends Pet>

public class Node<T> {
    T content;
    Node<T> nextNode;
    Node<T> beforeNode;

    public Node() {
        this.content = content;
    }

    public Node(T content, Node<T> nextNode, Node<T> beforeNode) {
        this.content = content;
        this.nextNode = nextNode;
        this.beforeNode = beforeNode;
    }

    public T getContent(){
        return content;
    }

    public static <T> T getSomething(T... a){
        return a[1];
    }

    public static void main(String[] args) {
        Node<String> node = new Node<>("ss", null, null);

        Node<Integer> node2 = new Node<>(6, null, null);
        Node<Integer> node3 = new Node<>(5, node2, null);
        Node<Dog> node4 = new Node<>(new Dog(new Person("Boris", 22), 5, "Barbosik"), null, null);

//      Ошибка, потому что пытаюсь в Ноду интежер запихать Ноду со стрингом
//        Node<Integer> node4 = new Node<>(4, node, null);
        System.out.println(node.getContent().getClass());
        System.out.println(node4.getContent().getClass());

        System.out.println();

        System.out.println(getSomething("a", 5, 6, "AS"));

//        List<? extends Pet> hlam = new ArrayList<>();
//      Можно только читать. Записать - ошибка!!!
//        hlam.add(new Dog(5, "Pups"));
//        hlam.add(new Dog(11, "Tomas"));

//        Так можно
        List<? super Dog> hlam = new ArrayList<>();
        hlam.add(new Dog(5, "Pups"));
        hlam.add(new Dog(11, "Tomas"));



        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(5, "Pups"));
        dogs.add(new Dog(11, "Tomas"));

    }
}
