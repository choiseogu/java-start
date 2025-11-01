package cond.ex;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 100;
        int oneDollar = 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액");
        }
        else if (dollar == 0) {
            System.out.println("환전할 금액 없음");
        }
        else if (dollar > 0) {
            System.out.println("환전 금액 : " + dollar * oneDollar);
        }
    }
}
