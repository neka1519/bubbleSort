package com.neka;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
//method 1 - to print the numbers - we don't want to return anything so void
  /*  public static void print(int[] numbers){
        for(int i: numbers){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
	int [] numbers = {8,61,79,2,7};
        System.out.println("Before sorting");
        print(numbers);

        bubbleSort(numbers);
        System.out.println(" ");

        System.out.println("After sorting");
        print(numbers);
    }

    public static void bubbleSort(int[] numbers) {
        boolean swap = true;

        while(swap){
        swap = false;

        for(int i=0; i<numbers.length-1;i++) {  //length-1 because, length returns the total no.of element - but we are accessing index
            if (numbers[i] > numbers[i + 1]) {  //20,10

                swap = true;

                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of elements");
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[no];
        int i=0;
        for(i=0;i<=no;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Arrays before sorting");
        System.out.println(arr[i]);

        //bubbleSort();

        System.out.println("Arrays after sorting");
        System.out.println(arr[i]);



    }*/
//method 1: printing numbers
public static void print(int[] numbers) {
    for(int i : numbers) {
        System.out.println(i+ " ");
    }
}

public static void bubbleSort(int[] numbers){
boolean swap = true;

        while(swap){
        swap = false; //if the number is already sorted
        for(int i =0; i<numbers.length-1;i++) {
        if (numbers[i] > numbers[i + 1]) {
           swap = true;
           int temp = numbers[i];
           numbers[i] = numbers[i + 1];
           numbers[i + 1] = temp;
       }
   }
   }
}

    public static void main(String[] args){
    int[] numbers = {8,99,100,2,7,1};

    System.out.println("Before sorting");
    print(numbers);

    bubbleSort(numbers);

    System.out.println("After sorting");
    print(numbers);
    }



    }

//t.c - n^2 : not best sorting method.
//time complexity : n*n 