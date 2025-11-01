package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값 -> int 범위 : -2147483648~2147483647
        long maxIntOver = 2147483648L; //int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue); //명시적 형변환에서 문제 없음. int에 들어갈 수 있는 최고값이므로

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue); //int의 최고값 +1 이라는 숫자가 들어갔기에 -2147483648 부터 다시 시작 -> 오버플로우 발생! -> 이를 활용해야지! 는 절대 안 됨. 이는 그냥 문제 발생이라고 보면 됨.
    }
}