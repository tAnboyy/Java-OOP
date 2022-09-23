package staticEg;

public class StaticBlock {
    static int a = 4;
    static int b;

    //static block executes just once ie when class is first loaded ie when first object is created
    static {
        System.out.println("static block...");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

        StaticBlock.b += 4;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock(); //static block not executed
        System.out.println(StaticBlock.b);

    }
}
