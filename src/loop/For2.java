package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) { //지역변수 i가 이 for문 안에서만 생존한다. -> while 문에서보다 나은 코드
            sum += i;
            System.out.println(i + " " + sum);
        }
    }
}
