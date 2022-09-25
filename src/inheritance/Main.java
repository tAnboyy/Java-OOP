package inheritance;

public class Main {
    public static void main(String[] args) {
//        BoxBase box = new BoxBase();
        BoxBase box = new BoxBase(2);
        BoxBase box2 = new BoxBase(box);
        System.out.println(box.l + " " + box.w + " " + box.h);


        BoxChild bc = new BoxChild(2.5);
        System.out.println(bc.weight + " " + bc.l);


        //the type of reference variable determines what members of the object can be accessed
        BoxBase bb = new BoxChild(2,3,4,8);
//        System.out.println(bb.weight);

        //child class type ref variable cannot store parent object, child class constructor cannot be called
//        BoxChild bc2 = new BoxBase();



    }
}
