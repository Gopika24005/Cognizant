public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // Narrowing
        int x = 7;
        double y = x; // Widening

        System.out.println("Double to Int: " + i);
        System.out.println("Int to Double: " + y);
    }
}
