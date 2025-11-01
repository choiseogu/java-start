package loop.ex;

public class LoopExAlpha {
    public static void main(String[] args) {
        int max = 10;
        for (int i = 1; i <= max * 2 - 1; i += 2) {
            System.out.println(" ".repeat(max - 1 - i/2) + "*".repeat(i));
        }
    }
}