package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];
        int total = 0;
        double avg;

        System.out.println("5개 정수 입력: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            total += nums[i];
        }

        avg = (double) total / nums.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
