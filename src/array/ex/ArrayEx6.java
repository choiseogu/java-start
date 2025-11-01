package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수 입력: ");
        int t = scanner.nextInt();

        int[] nums = new int[t];
        int minNum, maxNum;

        System.out.println(t + "개의 정수를 입력하세요.");
        for (int i = 0; i < t; i++) {
            nums[i] = scanner.nextInt();
        }

        minNum = nums[0];
        maxNum = nums[0];

        for (int i = 1; i < t; i++) {
            if (minNum > nums[i]) {
                minNum = nums[i];
            }
            if (maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }

        System.out.println("최소 수: " + minNum);
        System.out.println("최대 수: " + maxNum);
    }
}
