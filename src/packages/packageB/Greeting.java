package packages.packageB;

import static packages.packageA.Greeting.hello; //imports class outside current package

public class Greeting {
    public static void main(String[] args) {
        System.out.println("in package b");
        hello();
    }
}
