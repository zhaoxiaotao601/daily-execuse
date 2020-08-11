public class Demo6 {
    public void sort(int[] array,boolean b) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if((b==true&&array[j]<array[j-1])||(b==false&&array[j]>array[j-1])){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Demo6 d6 = new Demo6();
        int[] x = {5, 7, 6, 4, 3, 2, 8, 9, 1, 0, 55, 77, 66, 22, 11};
        d6.sort(x,true);
        for (int v : x) {
            System.out.println(v);
        }
    }
}
