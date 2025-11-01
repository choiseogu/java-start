package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.print("선택: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("입금액 입력: ");
                int depositAmount = scanner.nextInt();
                balance = deposit(balance, depositAmount);
            }
            else if (option == 2) {
                System.out.print("출금액 입력: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(balance, withdrawAmount);
            }
            else if (option == 3) {
                System.out.println("현재 잔액: " + balance);
            }
            else if (option == 4) {
                System.out.println("시스템 종료");
                break;
            }
            else {
                System.out.println("잘못된 옵션 입력");
            }
        }

    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 : " + balance);
        }
        else {
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
