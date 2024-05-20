package java8features;

public class LambdaFunction {

    public static void main(String args[]){
        Runnable runnable = () -> {
            for(int i =0;i<10;i++)
                System.out.println("Index value is: " + i);
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
