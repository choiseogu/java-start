package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; //이 지역 변수는 코드 전체에서 scope를 가져간다.
        int endNum = 100;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
