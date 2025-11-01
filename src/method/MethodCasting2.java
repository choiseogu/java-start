package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); //함수에서 double 형으로 자동 형변환 된다. 즉, 100.0 으로 출력된다.

    }
    public static void printNumber(double n) {
        System.out.println("숫자 : " + n);
    }
}
