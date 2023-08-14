public class Main {

    public static int numA (int a) {

        return a + 10;
    }

    public static int numB (int b) {

        System.out.println(b);
        return b - 5;
    }

    public static void main(String[] args) {


        int c = 4000000;
        int a = numA(10000);
        int b = numB(200000);

        System.out.println(b-a);
        System.out.println(b-a);
        System.out.println(b-a);
        System.out.println(b-a);

        System.out.println("Hello WORLD");
        System.out.println("Hello WORLD");
        System.out.println("Hello WORLD");
        System.out.println("Hello WORLD");
    }
}
