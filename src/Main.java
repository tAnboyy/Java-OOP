public class Main {
    public static void main(String[] args) {
        Student Thanmay = new Student(1, "", 94.8f);
        Thanmay.name = "Thanmay";
        System.out.println(Thanmay.name);
        System.out.println(Thanmay.marks);
        System.out.println(Thanmay.greeting());


        int a1 = 10;
        //wrapper classes
        Integer a2 = 10; //10 is an object, gives methods, properties to work with

        //final ~to const in cpp, ie content/value cannot be modified so must be initialised during declaration
        //guarantees immutability only for primitives
        //for objects, object itself cannot change ie cannot be reassigned but object's values can be changed
        final int INCREASE = 2;
//        INCREASE = 3;

        final A tanboy = new A("tanboy");
//        tanboy = new A("not allowed");
        tanboy.name = "allowed";

        //cannot destroy object manually, ie no destructors in java ie automatic garbage collection
        //can specify actions to perform when object is (being) destroyed using finalize
    }


}

class Student {
    //instance variables
    int rno;
    String name; //objects null by default
    float marks = 90f;

    //constructor is a special function, used to initialize instance variables, called when object is being created
    //no name, no return type
    //if not defined explicitly, default constructor used
    //if explicitly defined, default constructor no longer available
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    //constructor overloading
    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    //calling constructor within constructor
    Student() {
        //internally, Student(0,"",0f)
        this(0, "", 0f);
    }

    //method ie function within class
    String greeting() {
        return this.name; //this replaced by instance's reference variable
    }

}

class A {
    String name;
    A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed...");
    }
}