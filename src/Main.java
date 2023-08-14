public class Main {

    public static int numA (int a) {

        return a + 10;
    }

    public static int numB (int b) {

        System.out.println(b);
        return b - 5;
    }

    public static void main(String[] args) {


        int c = 40;
        int a = numA(10);
        int b = numB(20);

        System.out.println(b-a);
    }
}
