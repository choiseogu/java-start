package method;

//대원칙 1!! : 자바는 항상 변수의 값을 복사해 대입한다!! (매우 중요, 이 내용을 통해 어려운 참조 개념을 이해할 수 있다!)
public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전 number : " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후 number: " + number); //changeNumber 함수를 거쳤지만, 5가 출력된다. 이는 num2가 함수 안에서 계산이 된 것이기 때문이다.
        //num1과 num2는 서로 분리해서 생각해야한다. -> 이름을 number로 같게 해도 똑같이 생각할 수 있어야 한다.
    }

    public static void changeNumber(int number) { //main에서의 number와 changeNumber함수에서의 number은 아예 다른 변수이다.
        System.out.println("2. changeNumber 변경 전, number : " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number : " + number);
    }
}