public class Demo5 {
    //删除数组中的元素
    public int[] removeElementFromArray(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[index++] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 0,3, 4, 5, 6, 7,0, 8, 9};
        Demo5 d5 = new Demo5();
        int[] a = d5.removeElementFromArray(x,9);
        System.out.println(a);
    }
}
