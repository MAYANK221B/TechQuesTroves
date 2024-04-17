package multithreading;

/**
 * Implementing threading using Runnable Interface with lambda function
 */

public class ThreadImpl3 {
    public void demo()  {
        Runnable o1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    System.out.println("Thread 1 occurrence " + i);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable o2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    System.out.println("Thread 2 occurrence " + i);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        try{Thread.sleep(500);}
        catch (Exception e){};
        t2.start();
    }
}
