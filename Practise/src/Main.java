public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");
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
        ThreadImpl thread1 = new ThreadImpl();
         thread1.demo();
        ThreadImpl2 thread2 = new ThreadImpl2();
        thread2.demo();
    }
}