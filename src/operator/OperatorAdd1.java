package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1; //1.a를 0으로 읽고, 2. 0 + 1 연산 수행하고 3. 1을 a에 대입
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        //위 대신 증감연산자 사용
        ++a;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        --a;
        System.out.println("a = " + a);
    }
}
