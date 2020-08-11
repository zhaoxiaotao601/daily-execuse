public class Demo3 {
    public int maxCount(int[] array, boolean f) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (f == true) {
                if (array[i] > temp) {//最大值
                    temp = array[i];
                }
            } else {
                if (array[i] < temp) {//最小值
                    temp = array[i];
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] x = {1, 5, 7, 6, 9, 5, 3, 4, 11, 12, 45, 99};
        Demo3 d3 = new Demo3();
        int max = d3.maxCount(x,false);
        System.out.println(max);
    }
}
