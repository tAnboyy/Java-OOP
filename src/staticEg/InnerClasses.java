package staticEg;

public class InnerClasses {
    //outside class cannot be static

    static class Test { //wo static, would be dependent on outer class objects
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("A");
        Test b = new Test("B");

        System.out.println(a.name); //B
        System.out.println(b.name); //B
    }

    @Override
    public String toString() {
        return "Inner classes example";
    }
}
