package Package17;

public class OuterClass {
    private String str;
    private String fi;

    OuterClass(String fi) {
        this.fi = fi;
    }

    public class InnerClass{
        private String str;

        public InnerClass(String str) {
            this.str = str;
        }
        public String getStr() {
            return str + fi;
        }
    }
}
