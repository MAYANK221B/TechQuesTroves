package java8features;

public class TheFunctionalInterfaceImpl{
    public static void main(String args[]) {
        int count = 10;
        TheFunctionalInterface theFunctionalInterface = () -> {
            System.out.println("Count value is " + count);
        };
        theFunctionalInterface.displayCount();
    }
}
