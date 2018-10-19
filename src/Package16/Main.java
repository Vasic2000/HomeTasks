package Package16;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class claz = MyClass.class;
        System.out.println(claz.getName());

        MyClass myClass = (MyClass) claz.newInstance();
        Field field1 = claz.getDeclaredField("field");

        field1.setAccessible(true);
        field1.set(myClass, "ABV");

        Method method = claz.getDeclaredMethod("getField");
        method.setAccessible(true);
        System.out.println(method.invoke(myClass));

        int modifiers = field1.getModifiers();
        System.out.println(Modifier.PRIVATE);
    }
}
