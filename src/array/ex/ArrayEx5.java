package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자 개수 입력: ");
        int t = scanner.nextInt(); //배열의 크기가 동적할당 되는 것으로 볼 수 있음.
        int[] nums = new int[t];
        int total = 0;
        double avg;

        System.out.println(t + "개의 정수 입력: ");
        for (int i = 0; i < t; i++) {
            nums[i] = scanner.nextInt();
            total += nums[i];
        }
        avg = (double) total / t;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
