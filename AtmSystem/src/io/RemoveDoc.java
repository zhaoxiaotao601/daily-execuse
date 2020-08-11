package io;

import java.io.*;

public class RemoveDoc {
    public void copyFile(File file, String path) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            File newFile = new File(path + "//" + file.getName());
            bufferedWriter = new BufferedWriter(new FileWriter(newFile));
            char[] c = new char[1024];
            int count = bufferedReader.read(c);
            while (count != -1) {
                bufferedWriter.write(c);
                bufferedWriter.flush();
                count = bufferedReader.read(c);

            }
            System.out.println("完事");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //读取文件内容
    public static void main(String[] args) {
        RemoveDoc removeDoc = new RemoveDoc();
        removeDoc.copyFile(new File("F:\\test\\TT.java"), "F:");
//
//    File file = new File("F:\\test\\TT.java");
//    File file1 = new File("D:");
//    BufferedReader bufferedReader = null;
//    BufferedWriter bufferedWriter = null;
//
//    {
//        try {
//            bufferedReader = new BufferedReader(new FileReader(file));
//            bufferedWriter = new BufferedWriter(new FileWriter(file1));
//            int value = bufferedReader.read();
//            while (bufferedReader.read() != -1) {
//                bufferedWriter.write(value);
//                value = bufferedReader.read();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
    }
}