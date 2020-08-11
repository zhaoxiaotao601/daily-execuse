public class Demo1 {
    public int[][] changeArray(int[]a,int[]b){
        int[] temp=a;
        a=b;
        b=temp;
        int[][] result ={a,b};
        return result;
    }
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        int[]x={1,2,3,4,5,6,7,8,9};
        int[]y={9,6,3,5,4};
        int[][] value=d1.changeArray(x,y);
        x=value[0];
        y=value[1];
        for (int v : x) {
            System.out.println(v);
        }
        System.out.println("-----------------");
        for (int v : y) {
            System.out.println(v);
        }
    }
}
