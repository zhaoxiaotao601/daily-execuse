public class Demo {

    //交换数组
    //两个数组
    //交换
    //方法调用
    public void changeArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            a[i] = b[i];
            b[i] = x;
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        int[] x = {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8};
        d.changeArray(x, y);

        for (int v : x) {
            System.out.println(v);
        }
        System.out.println("-----------------");
        for (int v : y) {
            System.out.println(v);
        }
    }
}

