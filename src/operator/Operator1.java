package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b; //int형에 맞춰져, 2.5가 아닌 2가 저장됨 -> 0으로 나누게 되면 오류
        System.out.println("a / b = " + div);

        //나머지
        int mod = a%b;
        System.out.println("a % b = " + mod);
    }
}
