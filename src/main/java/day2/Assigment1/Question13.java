package day2.Assigment1;

import java.util.Scanner;

public class Question13 {

    public static int sum(int x){
        int result = 0;
        int i = 0;
        while(i < x){
            i++;
            result += i;
        }

        return result;
    }

    public static boolean numChecker(String input){
        try{
            int inputNum = Integer.parseInt(input);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter an positive number(Enter q to quit): ");

        while(true){
            Scanner input = new Scanner(System.in);
            String x = input.nextLine();
            int inputNum = 0;
            if(numChecker(x) == true){
                inputNum = Integer.parseInt(x);
                if(inputNum > 0){
                    System.out.println("The sum from 1 to x is: " + sum(inputNum));

                }else{
                    System.out.println("You entered a unexpected number. Please try again.");
                }
            }else if(x.equals("q")){
                System.out.println("Thank you for your using.");
                break;
            }else{
                System.out.println("You entered a unexpected number. Please try again.");
            }

        }
    }
}
