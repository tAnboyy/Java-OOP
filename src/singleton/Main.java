package singleton;

import java.security.Signature;

public class Main {
    public static void main(String[] args) {

        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance(); //ob1, ob2 reference the same object in memory
    }
}
