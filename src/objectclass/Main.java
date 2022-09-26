package objectclass;

public class Main {
    public static void main(String[] args) {
        Example eg1 = new Example(1, 9.9f);
        Example eg2 = new Example(1, 2.4f);
//        Example eg2 = eg1;

        String s1 = "Thanmay";
        String s2 = "Thanmay"; //Java is smart enough to not create a new string object with same content
//        if (s1 == s2) System.out.println("points to same object");

        if (eg1 == eg2) System.out.println("points to same object");
        if (eg1.equals(eg2)) System.out.println("Same content");

//        System.out.println(eg1 instanceof Example);
        System.out.println(eg1 instanceof Object);

        System.out.println(eg1.getClass());
    }
}
