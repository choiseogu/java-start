package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언 즉, 배열을 넣을 수 있는 변수를 생성한 것.

        students = new int[5]; //배열 생성 -> 배열 변수에 배열 넣어주기. 원소들은 0으로 초기화. -> 촏 5개의 int 형 변수가 만들어진다고 볼 수 있음.

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }
    }
}