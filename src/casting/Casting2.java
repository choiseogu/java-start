package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; //컴파일 오류 발생
        // 소수점을 때고 싶다면?
        intValue = (int) doubleValue; //(int)를 통해서 명시적 형변환 가능
        System.out.println(intValue); //.5를 때고 1로 형변환 되어 출력됨.
        System.out.println(doubleValue); //그렇다고 해서 doubleValue에 들어있는 1.5라는 숫자는 바뀌지 않는다.

        int z = (int) 10.5;
        System.out.println(z);
    }
}
