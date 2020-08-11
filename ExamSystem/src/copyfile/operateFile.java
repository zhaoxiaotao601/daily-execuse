package copyfile;

import java.io.*;

public class operateFile {
    public void copyFile(File file, String path) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //输入流
        try {
            fis = new FileInputStream(file);
            File newFile = new File(path + "//" + file.getName());//用于和output流建立联系的对象
            fos = new FileOutputStream(newFile);
            byte[] b = new byte[1024];
            int count = fis.read(b);
            while (count != -1) {
                fos.write(b, 0, count);
                fos.flush();
                count = fis.read(b);
            }
            System.out.println("复制完啦");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        operateFile op = new operateFile();
        op.copyFile(new File("D://test//test.txt"), "F://test");
    }
}
