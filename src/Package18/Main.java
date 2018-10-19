package Package18;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(" OO");
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass("AA");

        System.out.println(innerClass.getStr());
    }
}
