public class FibonacciExample {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int z=0;

        for (int i=0;i<10;i++){

            x=y+z;
            y=z;
            z=x;
            System.out.println(y);
        }

    }
}
