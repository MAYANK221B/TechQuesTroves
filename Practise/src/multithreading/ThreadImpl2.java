package multithreading;

/**
 * Implementing threading using Runnable Interface
 */
class Thread11 implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Thread 1 occurrence " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class Thread22 implements Runnable{
    public void run(){
        for(int i =0 ;i<5;i++) {
            System.out.println("Thread 2 occurrence " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadImpl2 {
    public void demo()  {
        Runnable o1 = new Thread11();

        Runnable o2 = new Thread22();
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        try{Thread.sleep(500);}
        catch (Exception e){};
        t2.start();
    }
}
