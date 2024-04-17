package multithreading;

/**
 * Implementing threading using Thread class
 */
class MT1 extends Thread{
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

class MT2 extends Thread{
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

public class MultiThreadConcepts  {
    public void demo() throws Exception  {
        MT1 mt1 = new MT1();
        MT2 mt2 = new MT2();
        //naming the threads
        mt1.setName("Thread 1");
        mt2.setName("Thread 2");

        //setting the priority of threads
        //Max = 10 , Min = 1 , Norm = 5
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("priority of mt1 thread is " + mt1.getPriority());

        mt1.start();
        mt2.start();
        System.out.println("is thread alive + " + mt2.isAlive());
        System.out.println("I don't wait for process to complete");
        // Join make main thread wait till other thread is not joined back after completion

        //printing thread names
        System.out.println("name of the first thread " + mt1.getName());
        System.out.println("name of the second thread " + mt2.getName());

        mt1.join();
        mt2.join();
        System.out.println("is thread alive + " + mt2.isAlive());
        System.out.println("I wait for process to complete");

    }
}
