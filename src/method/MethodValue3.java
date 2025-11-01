package method;

//대원칙 1!! : 자바는 항상 변수의 값을 복사해 대입한다!! (매우 중요, 이 내용을 통해 어려운 참조 개념을 이해할 수 있다!)
public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전 num1 : " + num1);
        num1 = changeNumber(num1); //changeNumber 함수에서 2배된 수를 다시 대입
        System.out.println("4. changeNumber 호출 후 num1: " + num1); // 값이 10으로 나옴을 알 수 있다.
    }

    public static int changeNumber(int num2) { //main에서의 number와 changeNumber함수에서의 number은 아예 다른 변수이다.
        num2 = num2 * 2;
        return num2;
    }
}
