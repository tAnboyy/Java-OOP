package staticEg;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    //property common to every human
    //ie belong to the class, not objects
    //can be accessed without creating an object ie independent of objects
    static long population;

    static void message() {
        System.out.println("Hello world!");
//        System.out.println(this.age); //non static not allowed within static
    }

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1; //directly updates class variable, convention
//        this.population += 1; //first searches instance variables but since static updates class variable
        Human.message();
    }
}
