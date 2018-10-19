package Package18;

public class OuterClass {
    private String str;
    private static String fi;

    OuterClass(String fi) {
        this.fi = fi;
    }

    public static class InnerClass{
        private String str;

        public InnerClass(String str) {
            this.str = str;
        }
        public String getStr() {
            return str + fi;
        }
    }
}
