package method;

//대원칙 1!! : 자바는 항상 변수의 값을 복사해 대입한다!! (매우 중요, 이 내용을 통해 어려운 참조 개념을 이해할 수 있다!)
public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전 num1 : " + num1);
        changeNumber(num1);
        //System.out.println("4. changeNumber 호출 후 num1: " + num1); //changeNumber 함수를 거쳤지만, 5가 출력된다. 이는 num2가 함수 안에서 계산이 된 것이기 때문이다.
        //num1과 num2는 서로 분리해서 생각해야한다.
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 : " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2 : " + num2);
    }
}
