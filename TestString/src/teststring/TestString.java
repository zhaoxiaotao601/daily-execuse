package teststring;

public class TestString {
    //8.获取给定的字符串中的全部数字
    public int findNumber(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int code = str.codePointAt(i);
            if (code >= 48 && code <= 57) {
                result += (char) code;
            }
        }
        return Integer.parseInt(result);
    }

    //7.将给定的字符串每一个首字母大写
    //参数 字符串，返回新的字符串
    public String firstLetterToUpper(String str) {
        String result = " ";
        String[] value = str.split(" ");
        for (int i = 0; i < value.length; i++) {
            String word = value[i];
            String fristLetter = word.substring(0, 1).toUpperCase();
            String otherLetter = word.substring(1);
            result = result.concat(fristLetter.concat(otherLetter) + " ");
        }
        return result.trim();
    }


    //6. 统计给定字母在字符串中出现的次数
    public int letterExistCount(String str, char letter) {
        return str.length() - str.replace(String.valueOf(letter), "").length();

//        int count = 0;//记录个数
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == letter) {
//                count++;
//            }
//        }
//        return count;
    }

    //5.寻找若干个字符串中最长的一个
    public String findMaxLengthString(String... strs) {
        String result = strs[0];//将第一个字符串存起来
        int maxLength = strs[0].length();///第一个字符串的长度
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > maxLength) {
                maxLength = strs[i].length();
                result = strs[i];
            }
        }
        return result;
    }

    //4.使字符串向右移
    public String moveToRight(String str, int count) {
        if (count > str.length()) {
            count %= str.length();
        }
        //截取前端部分
        String begin = str.substring(0, str.length() - count);
        //截取后半段
        String end = str.substring(str.length() - count);
        //拼接
        return end.concat(begin);
    }

    //3.判断字符串是否是回文字符串
    public boolean isPalindrome(String str) {
//        String value = this.reverse(str);
        if (this.reverse(str).equals(str)) {
            return true;
        }
        return false;
    }

    //2.正序和反序拼接
    public String reverseAndConcat(String str) {
//        String value = this.reverse(str);
//        String result = str.concat(value);
//        return result;
        return str.concat(this.reverse(str));
    }

    //1.将字符串反转  ok-->ko
    public String reverse(String str) {

        return new StringBuilder(str).reverse().toString();

//        char[] array = str.toCharArray();
//        for (int i = 0; i < array.length / 2; i++) {
//            char temp = array[i];
//            array[i] = array[array.length - 1-i];
//            array[array.length-1-i] = temp;
//        }
//        return new String(array);
    }


}
