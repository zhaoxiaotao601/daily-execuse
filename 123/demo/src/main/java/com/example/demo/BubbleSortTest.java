package com.example.demo;


/**
 * @Classname BubbleSortTest
 * @Description TODO
 * @Date 2020/8/5 10:14
 * @Created by Administrator
 */
public class BubbleSortTest {

    public void sort(int arr[]) {

        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int arrr : arr) {
            System.out.print(">>");
            System.out.print(arrr);
        }

    }

    public static void main(String[] args) {
        BubbleSortTest bubbleSort = new BubbleSortTest();
        int arr[] = { 5, 8, 9, 6, 3, 2, 1, 4, 7, 55, 66,};
        bubbleSort.sort(arr);
    }
}
