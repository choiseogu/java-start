package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        //for (int i = 0; i < students.length; i++) 말고 for-each로 향상된 for문을 만들어보자.
        for (int student : students) {
            total += student;
        }
        double avg = (double) total / students.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + avg);
    }
}
