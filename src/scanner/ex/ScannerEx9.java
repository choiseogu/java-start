package scanner.ex;

import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. (-1 입력 시 수 입력 종료):");
//        while (true) {
//            int num = scanner.nextInt();
//            if (num == -1) {
//                break;
//            }
//            sum += num;
//            count++;
//        }

        while ((input = scanner.nextInt()) != -1) { //이와 같이 while의 조건문에 scanner.nextInt()를 넣어 반복문을 축약할 수 있다.
            sum += input;
            count++;
        }

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균 " + (double) sum / count);
    }
}
