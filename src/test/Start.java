package test;

public class Start {

    public static void main(String[] args) {

        if (condition1() || condition2()) {
            System.out.println("ok");
        }

    }

    public static boolean condition1() {
        System.out.println("Condition1");
        return true;
    }

    public static boolean condition2() {
        System.out.println("Condition2");
        return false;
    }
}
