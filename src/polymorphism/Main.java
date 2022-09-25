package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shape circle2 = new Circle();
        circle2.area();

        //overriding is when reference variable is of type superclass and method to be called depends on object
        //'dynamic method dispatch' mechanism used to achieve this

        //final can be used to prevent overriding, used to enhance performance, 'early binding' ie method call can be resolved at compile time
        //final can be used to prevent inheritance, if class is final implicitly all its methods are final
        //cannot override static methods as it, can be inherited
        //overriding depends on objects, static doesn't, so static methods cannot be overridden
        Shape testGreeting = new Circle();
//        testGreeting.greeting();
//        Shape.greeting();
        Circle.greeting(); //inherited
    }
}
