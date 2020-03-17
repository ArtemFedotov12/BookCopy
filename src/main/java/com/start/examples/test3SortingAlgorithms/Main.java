package com.start.examples.test3SortingAlgorithms;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {



        int[] arr = {10,80,30,90,40,50,70};
        //arr = new int[20000];

       /*for(int i=0;i<arr.length;i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }*/

        long startTime = System.currentTimeMillis();
        my(arr);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime);
        System.out.println(Arrays.toString(arr));

    }

    private static void my(int[] arr) {

        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }

    }






    private static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    private static void sortQucik(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sortQucik(arr, low, pi-1);
            sortQucik(arr, pi+1, high);
        }
    }









    private static void sortArraySelection(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[index]) {
                    index = j;
                }

            }

            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

    }


    private static void sortArrayBubble(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapBubble(arr, j);
                }
            }
        }

    }




    private static void sortArrayInsertion(int[] arr) {

        int key;

        for (int i=1;i<arr.length;i++) {

            key=arr[i];

            int j= i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            //j can be -1 see j-- above
            arr[j+1]=key;


        }


    }



   private static void sortInet(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


        private static void swapBubble(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }









}
