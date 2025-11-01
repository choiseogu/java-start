package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        //int[] students;
        //students = new int[]{90,80,70,60,50}; //1. 가능 방법
        int[] students = new int[]{90,80,70,60,50,40,30,20}; //2. 이와 같이 리펙토링 가능 -> 이와 같은 경우 인덱스를 늘려도 됨. (동적 프로그래밍 가능)
        //int[] students = {90,80,70,60,50}; //3. 이와 같이도 가능하다. -> java가 추론을 진행해 줌.

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }
    }
}