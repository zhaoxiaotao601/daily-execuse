package copyfile;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

public class CopyFile {

    public void copyFile(File file, String path) {
        try {
            FileInputStream fis = new FileInputStream(file);
            File newFile = new File(path + "//" + file.getName());
            FileOutputStream fos = new FileOutputStream(newFile);
            byte[] b = new byte[1024];
            int count = fis.read(b);

            while (count != -1) {
                fos.write(b,0,count);
                fos.flush();
                count = fis.read(b);
            }
            System.out.println("复制完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void main(String[] args) {
        CopyFile cf = new CopyFile();
        cf.copyFile(new File("D://test//test.txt"), "F:test");
    }
}
