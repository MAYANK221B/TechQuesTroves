import java.util.*;

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

    public boolean binarySearch() {
        int[] numList = {5, 7, 13, 11, 1, 6, 9};
        Arrays.sort(numList);
        int find = 2;
        int left = 0;
        int right = numList.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numList[mid] == find)
                return true;
            else if (find < numList[mid]) {
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return false;
    }

    public boolean binarySearchRec(int numList[], int left, int right, int find) {
        int mid = left + (right - left) / 2;
        if (left > right) {
            return false;
        }
        if (find == numList[mid]) {
            return true;
        } else if (find < numList[mid]) {
            return binarySearchRec(numList, 0, mid - 1, find);
        } else
            return binarySearchRec(numList, mid + 1, right, find);
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
            numList[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < 6; k++) {
            System.out.print(numList[k] + ",");
        }
        System.out.println();
    }

    /**
     * 2
     * Find the missing number
     * In a list of 10 there are 9 number ,and we need to find the missing number
     */
    public void findMissingNumber() {
        //Find out the sum of n numbers and subtract it from sum of the array;
        int n = 10;
        int[] numList = {1, 4, 3, 2, 9, 8, 7, 6, 10};
        int sum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += numList[i];
        }
        int missingNumber = sum - arraySum;
        System.out.println("Missing Number is " + missingNumber);
    }

    /**
     * 3
     * Merge two Sorted array
     */
    public void mergeSortedArrays() {
        //keep two pointer, compare, place it.
        int[] numList1 = {1, 3, 4, 7, 8};
        int[] numList2 = {2, 3, 7, 9, 11, 12, 13};
        int[] numList3 = new int[numList1.length + numList2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < numList1.length && j < numList2.length) {
            if (numList1[i] <= numList2[j]) {
                numList3[k++] = numList1[i++];
            } else if (numList1[i] > numList2[j]) {
                numList3[k++] = numList2[j++];
            }
        }
        while (j < numList2.length) {
            numList3[k++] = numList2[j++];
        }
        while (i < numList1.length) {
            numList3[k++] = numList1[i++];
        }
        for (int m = 0; m < k; m++) {
            System.out.print(numList3[m] + ",");
        }
        System.out.println();

    }

    /**
     * 4
     * Check if second array is subset of first array
     * using frequency array
     */
    public boolean subsetArray() {
        int[] numList1 = {1, 2, 3, 4, 5, 8};
        int[] numList2 = {1, 2, 5, 4};
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

    /**
     * 5
     * Merging of two sorted array without using extra space
     * GAP algorithm
     */
    public void mergeArrayWithoutExtraSpace() {
        int[] numList1 = {1, 2, 3, 7, 9};
        int[] numList2 = {4, 5, 10, 11, 12, 13};
        int n = numList1.length;
        int m = numList2.length;
        int len = n + m;
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < n && right >= n) {
                    swap(numList1, numList2, left, right - n);
                } else if (left >= n) {
                    swap(numList2, numList2, left - n, right - n);
                } else
                    swap(numList1, numList1, left, right);
                left++;
                right++;
            }
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }
        for (int j : numList1) {
            System.out.print(j + ",");
        }
        System.out.println();
        for (int j : numList2) {
            System.out.print(j + ",");
        }
        System.out.println();

    }

    /**
     * 6
     *Function two swap two numbers
     */
    private void swap(int[] arr1, int[] arr2, int ind1, int ind2) {
            if(arr1[ind1]>arr2[ind2]){
                int temp = arr1[ind1];
                arr1[ind1] = arr2[ind2];
                arr2[ind2] = temp;
    }
}

    /**
     * 7
     * count the number of pairs for which given sum is possible
     * using hashMap as time complexity for value retrieval is O(n) for average case.
     */
    public void pairsForSum(){
        int[] numList = {1,1,1,1};
        int sum = 2;
        int n = numList.length;
        int b;
        Map<Integer,Integer> numDict = new HashMap<>();
        int count =0;
        for (int j : numList) {
            b = sum - j;
            if (numDict.containsKey(b)) {
                int freq = numDict.get(b);
                count += freq;
            }
            numDict.put(j,numDict.getOrDefault(j,0)+1);
        }
        System.out.println(count);
    }

    /**
     * Print Union of two given array
     * Using HashSet here
     */
    public void unionOfArray(){
        int[] numList1 = {1,3,4,5,8};
        int[] numList2 = {1,2,6,7};
        Set<Integer> numSet = new HashSet<>();
        for(int i : numList1){
            numSet.add(i);
        }
        for(int i : numList2){
            numSet.add(i);
        }
        System.out.println(numSet);
    }

    //Note: answer can be any permutation of the array order, but we will observe ascending order
    // as HashSet uses hashCode() and in Java, the default hashCode() method for integers returns the integer value itself.
    // Since the elements in our array are integers and are added to the HashSet,
    // they are likely to be stored in ascending order based on their integer values.

    /**
     * Keeping negative ahead of positive, not necessarily in ascending order
     */
    public void negativeAheadPositive(){
        int[] numList = {1,3,-2,5,-8,8,-1};
        int left =0;
        int right = numList.length-1;
        while(left<right){
            if(numList[left]>0 && numList[right]<0){
                int temp = numList[left];
                numList[left] = numList[right];
                numList[right] = temp;
                left++;
                right--;
            } else if (numList[left]<0) {
                left++;
            } else if (numList[right]>0) {
                right--;
            }
        }
        for(int i : numList)
            System.out.print(i + ",");
        System.out.println();
    }


    }
