package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // -> int / int : 같은 타입의 계산, 따라서 int 형 반환
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; // -> int / int : 같은 타입의 계산, 따라서 int 형 변환 -> double div2에 대입되면서 doble로 자동형변환 발생
        System.out.println("div2 = " + div2); //1.0

        double div3 = 3.0 / 2; // -> double / int : 서로 다른 타입의 계산 더 큰 범위인 double 형 반환
        System.out.println("div3 = " + div3); //1.5

        double div4 = (double) 3 / 2; // -> double / int : 서로 다른 타입의 계산 더 큰 범위인 double 형 반환
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // -> double / int : 서로 다른 타입의 계산 더 큰 범위인 double 형 반환
        System.out.println("result = " + result); //1.5

        //여기서의 포인트!(대원칙)
        //1.같은 타입끼리 계산은 같은 타입의 결과
        //2.서로 다른 타입의 계산은 큰 범위로 자동 형변환이 됨.
    }
}
