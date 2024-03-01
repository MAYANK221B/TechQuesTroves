import java.util.Arrays;

public class ArraysPrac {

    public void oneDArray() {
        int[] numList = new int[5];
        for (int i = 0; i < 5; i++)
            numList[i] = i;
        for (int i = 0; i < 5; i++)
            System.out.print(numList[i] + ",");
        System.out.println();
    }

    public void twoDArray() {
        int[][] numList = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numList[i][j] + ",");
            }
            System.out.println();
        }
    }

    public boolean binarySearch(){
        int[] numList = {5,7,13,11,1,6,9};
        Arrays.sort(numList);
        int find = 2;
        int left = 0;
        int right = numList.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if (numList[mid]==find)
                  return true;
            else if (find<numList[mid]) {
                right = mid-1;
            }
            else
                left = mid+1;
        }
        return false;
    }

    public boolean binarySearchRec(int numList[],int left, int right, int find) {
        int mid = left + (right-left)/2;
        if(left>right){
            return false;
        }
        if (find == numList[mid]){
            return true;
        } else if (find<numList[mid]) {
            return binarySearchRec(numList,0,mid-1, find);
        }
        else
            return binarySearchRec(numList,mid+1,right, find);
    }

    /**
     * 1
     * Reverse the array
     */
    public void arrayReverse() {
        // Swap the number and increment left position and decrement right position until left is less than right
        int[] numList = {1, 2, 3, 4, 5, 6};
        int i = 0;
        int j = numList.length - 1;
        int temp;
        while (i < j) {
            temp = numList[i];
            numList[i] = numList[j];
            numList[j]=temp;
            i++;
            j--;
        }
        for(int k =0 ;k<6; k++){
            System.out.print(numList[k] + ",");
        }
        System.out.println();
    }

    /**
     * 2
     * Find the missing number
     * In a list of 10 there are 9 number ,and we need to find the missing number
     */
    public void findMissingNumber(){
        //Find out the sum of n numbers and subtract it from sum of the array;
        int n =10;
        int[] numList = {1,4,3,2,9,8,7,6,10};
        int sum = (n*(n+1))/2;
        int arraySum =0;
        for (int i =0; i<n-1 ;i++){
            arraySum+= numList[i];
        }
        int missingNumber = sum-arraySum;
        System.out.println("Missing Number is " + missingNumber);
     }

     /**
      * 3
      * Merge two Sorted array
      */
     public void mergeSortedArrays(){
         //keep two pointer, compare, place it.
        int[] numList1 = {1,3,4,7,8};
        int[] numList2 = {2,3,7,9,11,12,13};
        int[] numList3 = new int[numList1.length+numList2.length];
        int i=0;
        int j=0;
        int k =0;
        while(i<numList1.length && j<numList2.length ){
            if(numList1[i]<=numList2[j]){
                numList3[k++]=numList1[i++];
            } else if (numList1[i]>numList2[j]) {
                numList3[k++]=numList2[j++];
            }
        }
            while(j<numList2.length){
                numList3[k++]=numList2[j++];
            }
             while(i<numList1.length){
                 numList3[k++]=numList1[i++];
             }
         for(int m =0; m<k;m++){
             System.out.print(numList3[m] + ",");
         }
         System.out.println();

     }


     public boolean subsetArray(){
         int[] numList1 = {1,2,3,4,5,8};
         int[] numList2 = {1,2,5,4};
         int[] freqList3 = new int[10];
         for (int j : numList1) {
             freqList3[j]++;
         }
         for (int j : numList2) {
             freqList3[j]--;
             if (freqList3[j] < 0) {
                 return false;
             }
         }
         return true;
     }







    }
