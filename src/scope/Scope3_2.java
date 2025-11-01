package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2; // temp 지역변수 생존 시작
            System.out.println("temp = " + temp);
        } //temp 변수 생존 종료 -> 1.메모리에서 제거, 2.고려 변수 감소
        System.out.println("m = " + m);
    }
}
