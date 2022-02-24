package day2.Assigment1;

import java.util.Arrays;

public class Question14 {
    public static int[] arrayMerger(int[] arr1, int[] arr2){
        int[] resultArr = new int[arr1.length + arr2.length];
        int resultArrPointer = 0;

        int i = 0;
        while(i < arr1.length){
            resultArr[resultArrPointer] = arr1[i];
            i++;
            resultArrPointer++;
        }
        i = 0;
        while(i < arr2.length){
            resultArr[resultArrPointer] = arr2[i];
            i++;
            resultArrPointer++;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        int[] testArray1 = new int[]{2,2,2};
        int[] testArray2 = new int[]{3,3,3};

        int[] output1 = arrayMerger(testArray1, testArray2);

        System.out.println(Arrays.toString(output1));
    }
}
