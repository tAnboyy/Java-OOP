package singleton;

//only one instance of class allowed ie make constructor inaccessible
public class Singleton {
    private int num = 10;
    private Singleton () {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        //check if an instance is already created
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
