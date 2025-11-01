package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); // int형 매개변수를 받기에 들어가지 않아. 컴파일 오류 발생 : 큰 타입(double)을 작은 타입(int)에 넣을 수 없다.
        printNumber((int) number); //명시적 형변환으로 int 형 매개변수에 대입
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
