package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수 입력: ");
        int num = scanner.nextInt();

        int[][] students = new int[num][3];
        String[] subs = {"국어", "영어", "수학"};

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(subs[j] + " 성적: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            double avg;
            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }
            avg = (double) total / students[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
