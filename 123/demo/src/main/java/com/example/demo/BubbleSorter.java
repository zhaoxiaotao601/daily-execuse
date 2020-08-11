package com.example.demo;

import java.util.Comparator;

/**
 * @Classname BubbleSorter
 * @Description TODO
 * @Date 2020/8/5 9:33
 * @Created by Administrator
 */
public class BubbleSorter implements Sorter {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] list) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        return list;
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comp) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;
            for (int j = 0; j < len - i; ++j) {
                if (comp.compare(list[j], list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        Integer arr[] = {1, 5, 6, 3, 4, 5, 6, 7, 8, 9, 55, 33};
        Integer[] sort = bubbleSorter.sort(arr);
        for (int arrr :sort) {
            System.out.println(arrr);
        }
    }
}

