package cond.ex;

public class CondEX5 {
    public static void main(String[] args) {
        String grade = "F";

        switch (grade) {
            case "A":
                System.out.println("탁월");
                break;
            case "B":
                System.out.println("좋음");
                break;
            case "C":
                System.out.println("준수");
                break;
            case "D":
                System.out.println("향상필요");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 학점");
                break;
        }
    }
}
