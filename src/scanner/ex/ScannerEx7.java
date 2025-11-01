package scanner.ex;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름 입력 (종료 입력 시 종료): ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이 입력: ");
            int age = scanner.nextInt(); // 10 (엔터)입력 시 -> 10\n이 남게 되고, age는 10만 가져감. 그래서 다음 while문 반복에서 \n을 읽고 가져가는 버그 발생
            scanner.nextLine(); // 이 코드를 통해 \n을 처리해주기.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
