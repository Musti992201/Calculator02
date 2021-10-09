public class aufgabe2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);

        printResult(2 + 3);
        printResult(a);
        int result = add(2, 5);
        printResult(result);
        printResult(add(2, 6));
        schreibHallo();
        int ten = returnTen();
        System.out.println(ten);
    }

    public static void printResult(int result) {
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void schreibHallo() {
        System.out.println("Hallo");
    }


    public static int returnTen() {
        return 10;
    }
}



