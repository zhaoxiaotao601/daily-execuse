package teststring;

public class TestMain {
    public static void main(String[] args) {
        TestString ts = new TestString();

//        String result = ts.reverse("56565655");
//        System.out.println(result);

//        String result = ts.reverseAndConcat("12345");
//        System.out.println(result);

//        Boolean result=ts.isPalindrome("abccba");
//        System.out.println(result);

//        String result = ts.moveToRight("123456789",11);
//        System.out.println(result);

//        String result = ts.findMaxLengthString("123","123456","123456789","123456789123");
//        System.out.println(result);

//        int count = ts.letterExistCount("this is a test of java",'j');
//        System.out.println(count);

//        String result = ts.firstLetterToUpper("this is a test of java");
//        System.out.println(result);
//        System.out.println(result.length());

        long time1 = System.currentTimeMillis();
        int result = ts.findNumber("g1g2g3g4g5g6h7h8h9h7");
        long time2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(time2 - time1);

    }
}
