package day2.Assigment1;

public class Question15 {
    public static int secondMax(int[] arr){
        int firstMax, secondMax;
        firstMax = 0;
        secondMax = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }else if(arr[i] > secondMax && arr[i] < firstMax){
                secondMax = arr[i];
            }

        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,4,5,-3,-6,1000,999};
        System.out.println(secondMax(test1));
    }
}
