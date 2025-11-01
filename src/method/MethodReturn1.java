package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
        //여기에 아무것도 없다면, 즉 메소드에서 무조건! 필요한 반환값이 정의 안 된거라면 컴파일 오류 발생
        else {
            return false;
        }
    }
}