package multithreading;

/**
 * Adding synchronized makes counter a synchronized method,
 * only one thread can work on it at a time
 * so while t1 is updating count value for once, t2 wont interfere and vise versa.
 * otherwise if both try to update at a time there could be a case where while updating count value for both thread is same
 * and addition from both thread comes out to be addition of one only.
 */

class Counter{
    int count =0;
    public synchronized void counter(){
        count++;
    }
}

public class SyncThreads {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int j =0 ; j<1000;j++)
                    c.counter();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int j =0 ; j<1000;j++)
                    c.counter();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count value is " + c.count );

    }

}
