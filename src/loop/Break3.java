package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1;;i++) { //while(true)처럼 사용 가능 -> 여기서 for 문 안에 증가변수에 대한 정의를 통해 코드르 깔끔하게 전개하 수 있다.
            sum += i;
            if (sum > 10) {
                System.out.println("합계가 10 이상, sum = " + sum);
                break;
            }
        }
    }
}
