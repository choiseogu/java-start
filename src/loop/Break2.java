package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (;;) { //while(true)처럼 사용 가능
            sum += i;
            if (sum > 10) {
                System.out.println("합계가 10 이상, sum = " + sum);
                break;
            }
            i++;
        }
    }
}
