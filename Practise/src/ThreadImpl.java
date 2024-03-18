/**
 * Implementing threading using Thread class
 */
class Thread1 extends Thread{
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

    class Thread2 extends Thread{
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

public class ThreadImpl {
    public void demo()  {
    Thread1 thread1 = new Thread1();
    Thread2 thread2 = new Thread2();
    thread1.start();
    thread2.start();
    }
}
