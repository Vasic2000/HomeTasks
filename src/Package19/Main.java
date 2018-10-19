package Package19;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(" NOT");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass("DID");

        System.out.println(innerClass.getStr());
    }
}
