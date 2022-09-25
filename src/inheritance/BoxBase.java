package inheritance;

public class BoxBase {
    double l;
    double w;
    double h;

    BoxBase() {
        super(); //every class inherits Object class by default

        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //cube
    BoxBase(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    //cuboid
    BoxBase(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    BoxBase(BoxBase old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void printInfo() {
        System.out.println(this.l + " " + this.w + " " + this.h);
    }
}
