package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        //반환값이 없다면(즉, void 한정), 그냥 비워두면 java가 알아서 return; 을 붙여준다.
    }

}
