package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 3;

        //else if 문 사용하여 조건 만족 시 밑에 있는 조건문은 실행 안 하기에 효율성 높아짐. + 위의 조건을 만족하지 않은 걸 통해 조건식을 줄일 수 있음.
        if (age <= 7) {
            System.out.println("미취학");
        }
        else if (age <= 13) {
            System.out.println("초등학생");
        }
        else if (age <=16) {
            System.out.println("중학생");
        }
        else if (age <= 19) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("성인");
        }
    }
}
