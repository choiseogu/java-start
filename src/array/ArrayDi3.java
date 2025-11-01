package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 배열 만들기
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; // 행2, 열3 배열 선언 및 초기화

        for (int row = 0; row < arr.length; row++) { //length를 사용하는 포인트를 잘 봐보자.
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
