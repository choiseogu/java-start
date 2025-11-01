package cond.ex;

public class CondEx2 {
    public static void main(String[] args) {
        int det = 130;

        if (det <= 1) {
            System.out.println("도보");
        }
        else if (det <= 10) {
            System.out.println("자전거");
        }
        else if (det <= 100) {
            System.out.println("자동차");
        }
        else {
            System.out.println("비행기");
        }
    }
}
