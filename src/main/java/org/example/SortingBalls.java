package org.example;

import java.util.Scanner;

public class SortingBalls {

    public static void main(String[] args) {
        SortingBalls();
    }


    public static void SortingBalls() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = new int[60];
        int index = 0;

        while (true) {
            System.out.println("Enter an integer (or 'q' to quit):");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                inputArr[index] = num;
                index++;

                int[] sortedArr = bubbleSort(inputArr);
                printArray(sortedArr);
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer or 'q' to quit.");
            }
        }
        scanner.close();
    }

    private static void printArray(int[] sortedArr) {
        for (int j : sortedArr) {
            if (j != 0) {
                System.out.print(j + ", ");
            }
        }
    }
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
