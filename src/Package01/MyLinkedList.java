package Package1;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList implements Collection<Node> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (o.getClass() != Node.class) return false;

        return false;
    }

    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Node node) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Node> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator it = c.iterator();
        while(it.hasNext())
        {
            Node node = (Node) it.next();
            //if (contains(node))
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
