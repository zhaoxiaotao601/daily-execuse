public class Demo2 {
    public void changeArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9,5,6,5,4,8,4,55,4};
        d2.changeArray(x);
        for (int v : x) {
            System.out.println(v);
        }
    }
}
