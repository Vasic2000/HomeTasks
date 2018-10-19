package Package19;

public class OuterClass {
    private String str;
    private String fi;

    OuterClass(String fi) {
        this.fi = fi;
    }

    public class InnerClass {
        private String str;

        public InnerClass(String str) {
            this.str = str;
        }

        public String getStr() {
            class LocalClass {
                String sstr;

                LocalClass(String sstr) {
                    this.sstr = sstr;
                }
            }

            return str + fi;
        }
    }
}
