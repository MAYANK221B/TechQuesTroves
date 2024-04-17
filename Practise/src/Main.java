import multithreading.MultiThreadConcepts;
import multithreading.ThreadImpl3;

public class Main {
    public static void main(String[] args) throws Exception {


        /**
         * Arrays Questions
         */
        System.out.println("----------------------ARRAYS-------------------------");

        ArraysPrac arraysPrac = new ArraysPrac();
        arraysPrac.oneDArray();
        arraysPrac.twoDArray();
        System.out.println(arraysPrac.binarySearch());
        System.out.println(arraysPrac.binarySearchRec(new int[]  {1,5,6,7,9,11,13},0,6,13));
        arraysPrac.arrayReverse();
        arraysPrac.findMissingNumber();
        arraysPrac.mergeSortedArrays();
        System.out.println(arraysPrac.subsetArray());
        arraysPrac.mergeArrayWithoutExtraSpace();
        arraysPrac.pairsForSum();
        arraysPrac.unionOfArray();
        arraysPrac.negativeAheadPositive();
        System.out.println(arraysPrac.fibonacci(8));
        System.out.println(arraysPrac.fibonacciRec(8));

        /**
         * Multithreading questions
         */
        System.out.println("----------------------MULTITHREADING-------------------------");

        //multithreading.ThreadImpl thread1 = new multithreading.ThreadImpl();
        //thread1.demo();
        //multithreading.ThreadImpl2 thread2 = new multithreading.ThreadImpl2();
        //thread2.demo();
        //ThreadImpl3 threadImpl3 = new ThreadImpl3();
        //threadImpl3.demo();
        MultiThreadConcepts mtc = new MultiThreadConcepts();
        mtc.demo();


        /**
         * Singleton Class, trying to get two instances and printing them
         * Should come same for both, as Singleton return only one instance
         */
        System.out.println("----------------------SINGLETON-------------------------");
        SingletonClass instance1 = SingletonClass.getInstance();
        System.out.println(instance1);
        //Trying to get one more instance
        SingletonClass instance2 = SingletonClass.getInstance();
        System.out.println(instance2);



    }
}