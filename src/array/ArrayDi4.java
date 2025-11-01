package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 배열 만들기
        int[][] arr = new int[10][10];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; //후위 증감 연산자로 코드 한 줄 줄이는 것도 가능하다.
            }
        }

        for (int row = 0; row < arr.length; row++) { //length를 사용하는 포인트를 잘 봐보자.
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
