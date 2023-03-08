public class SwapTwoNumbersWithOut {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf(a+"     "+b);
    }
}
