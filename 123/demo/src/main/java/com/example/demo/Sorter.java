package com.example.demo;
import java.util.Comparator;
/**
 * @Classname Sorter
 * @Description TODO
 * @Date 2020/8/5 9:32
 * @Created by Administrator
 */

/**
 * 排序器接口(策略模式: 将算法封装到具有共同接口的独立的类中使得它们可 以相互替换) * @author骆昊 *
 */
public interface Sorter {
    /**
     * 排序
     * 第 323 页 共 485 页
     *
     * @param list 待排序的数组
     * @return
     */
    public <T extends Comparable<T>> T[] sort(T[] list);

    /**
     * 排序 * @param list 待排序的数组 * @param comp 比较两个对象的比较器
     */
    public <T> void sort(T[] list, Comparator<T> comp);
}

