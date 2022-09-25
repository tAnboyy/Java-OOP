package inheritance;

public class BoxChildChild extends BoxChild {
    private double cost; //'data hiding', part of encapsulation

    public BoxChildChild(double cost, double weight) {
        super(weight);
        this.cost = cost;
    }

    //getter (encapsulation)
    public double getCost() {
        return cost;
    }

    BoxChildChild(double cost, BoxChild other) {
        super(other);
        this.cost = cost;
    }

    public BoxChildChild(double cost, double l, double h, double w, double weight) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
