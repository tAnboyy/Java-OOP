package objectclass;

public class Example {
    int num;
    float gpa;

    Example(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    @Override
    public int hashCode() { //unique number representation of an object, to check for uniqueness
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((Example)obj).num;
    }
}
