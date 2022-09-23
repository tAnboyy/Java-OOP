package staticEg;

public class Main {
    public static void main(String[] args) { //static allows main() to be called wo creating an object of Main class
        //static stuff is resolved at compile time
        Human t1 = new Human(1, "t1", 10, false);
        Human t2 = new Human(2, "t2", 20, true);

        System.out.println(Human.population);

        Main obj = new Main();
        obj.dependent_on_objects2();
    }

    static void not_dependent_on_objects() {
//        dependent_on_objects(); //logically incorrect
        Main obj = new Main();
        obj.dependent_on_objects();
    }

    void dependent_on_objects2() {
        dependent_on_objects();
    }
    void dependent_on_objects() {
        System.out.println();
    }
}
