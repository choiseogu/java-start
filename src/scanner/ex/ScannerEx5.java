package scanner.ex;

public class ScannerEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = b;
        b = a;
        a = temp;

        System.out.println("바뀐 a 값: " + a);
        System.out.println("바뀐 b 값: " + b);
    }
}
