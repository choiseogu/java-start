package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for 문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number);
        }
        System.out.println();
        System.out.println("------------");

        //향상된 for문, for-each문
        for (int number : numbers) { //배열에 있는 원소를 0번째 부터 순서대로 int 형 변수 numbers에 넣으면서 출력.
            System.out.print(number); //이는 배열 전체를 탐색하겠다는 조건 하에서 사용하는 for-each문이다!
        }

        //향상된 for문(for-each문) 사용하지 못 하는 경우, 증가하는 index 값 필요할때 -> 향상된 for문에는 index 값이 숨어있기에
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "번 결과: " + numbers[i]); //이와 같이 index를 사용해야할 때에는 사용할 수 없다.
        }
    }
}
