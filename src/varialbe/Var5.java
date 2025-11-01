package varialbe;

//변수 초기화
public class Var5 {
    public static void main(String[] args) {
        int a;
        a = 1;
        System.out.println(a);

        int b = 2; //선언과 동시에 초기화도 가능.
        System.out.println(b);

        int c = 3, d = 4; //여러 변수를 동시에 선언과 초기화를 할 수도 있음.
        System.out.println(c);
        System.out.println(d);

        //이와 같이 초기화는 곡 필요한 내용이다. 선언하고 초기화 안 하고 변수를 사용하면 오류가 남.
        // -> 이유: 메모리는 어떤 실행을 위해서 계속 비워두는 것이 아니다. 즉, 다른 프로그램을 실행하면서 기조 공간에 다른 내용이 있을 수도 있다. 그렇기에 java에서는 초기화를 강제할 수 있게 하는 것임.

    }
}
