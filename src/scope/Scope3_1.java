package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //이 temp 지역변수는 if 문 안에서만 필요한데 이는 1. 불필요한 메모리를 차지한다, 2. 생존 지역변수 개수가 증가하므로, 고려해야하는 변수 개수가 늘어난다. 이는 코드 복잡성으로 이어진다.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
