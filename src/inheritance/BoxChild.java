package inheritance;

public class BoxChild extends BoxBase {
    double weight;

    BoxChild() {
        this.weight = -1;
    }

    public BoxChild(double weight) {
        this.weight = weight;
    }

    BoxChild(BoxChild other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxChild(double l, double h, double w, double weight) {
        super(l, h, w); //call the parent class constructor, initializes parent variables (if private not possible)
        //wo this, super() is called by default

        this.weight = weight;
        System.out.println(super.h); //to explicitly access base class's variables

        //super class is unaware of child classes
    }

}
