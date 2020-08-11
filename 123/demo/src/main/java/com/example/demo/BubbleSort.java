package com.example.demo;

/**
 * @Classname BubbleSort
 * @Description TODO
 * @Date 2020/8/5 9:54
 * @Created by Administrator
 */

import org.springframework.validation.BindingResult;

/**
 * @program: JavaSpecialityDeep
 * @author: Mr.Zerah
 * @create: 2018-10-25 22:52
 * @description: 冒泡排序
 * 冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
 * 如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，重复n 次，
 * 就完成了 n 个数据的排序工作。
 **/

public class BubbleSort {

    public void sort(int[] arr) {
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 5, 8, 9, 6, 3, 2, 1, 4, 7, 55, 66,};
        bubbleSort.sort(arr);
    }
}
