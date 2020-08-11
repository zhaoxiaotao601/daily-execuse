public class Demo4 {
    public String isExist(int[] array, int element) {
        String result = "不存在";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = "存在";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Demo4 d4 = new Demo4();
        String result = d4.isExist(x, 14);
        System.out.println(result);
    }
}
