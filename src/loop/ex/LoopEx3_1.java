package loop.ex;

public class LoopEx3_1 {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
