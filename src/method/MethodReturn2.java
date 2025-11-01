package method;

import java.util.Scanner;

public class MethodReturn2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sn.nextInt();

        checkAge(age);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입불가.");
            return; //return 만나면 함수 종료
        }
        System.out.println(age + "살, 입장 가능");
    }
}
