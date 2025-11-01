package varialbe;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128~127
        short s = 32767; // -32768~32767
        int i = 2147483647; //-2147483648~2147483647
        long l = 9223372036854774807L; //-9223372036854774808~9223372036854774807 -> 끝에는 L을 붙여줘야 함.

        //실수
        float f = 10.0f; // 끝에 f 붙여줘야 함.
        double d = 10.0; // 기본적으로 실수 사용시 double 이용한다. float은 정밀도가 낮아, 오류가 잘 발생함.
    }
}
