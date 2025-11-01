package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //지역변수 m 생존 시작
        if (true) {
            int x = 20; //지역변수 x 생존 시작
            System.out.println("if m = " + m); //지역 변수 m 아직 생존
            System.out.println("if x = " + x); //지역 변수 x 아직 생존
        }
        //여기서 부터 지역 변수 x 생존 종료
        //System.out.println(x); -> 오류 발생
        System.out.println("main m = " + m); //지역변수 m은 아직 생존
        //이러한 생존은 코드 블럭을 기준으로 보면 된다.
    }
    //여기서 부터 지역 변수 m 생존 종료
}
