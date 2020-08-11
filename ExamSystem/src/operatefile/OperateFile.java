package operatefile;

import java.io.*;

public class OperateFile {

    public void superCopyFile(File file, String newPath) {
        //获取file的绝对路径，拼串4的方式获取旧文件
        String oldFilePath = file.getAbsolutePath();
        String newFilePath = newPath + oldFilePath.split(":")[1];
        //创建一个新的file对象
        File newFile = new File(newFilePath);
        File[] files = file.listFiles();//获取当前传递进来的file对象的所有子元素
        //判断传入的是文件还是文件夹
        if (files != null) {       //不为空说明是一个文件夹
            //通过file创建一个新文件夹
            newFile.mkdir();
            System.out.println("文件夹复制完毕");
            //里面的文件
            if (files.length != 0) {
                for (File f : files) {
                    this.superCopyFile(f, newPath);
                }
            }
        } else {                  //否则是一个文件
            //创建两个文件流，分别读取旧的file和新的newfile
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                byte[] b = new byte[1024];
                int count = fis.read(b);//count 表示有效的字节个数
                while (count != -1) {
                    fos.write(b, 0, count);
                    fos.flush();
                    count = fis.read(b);//别忘了再读一遍
                }
                System.out.println(newFile.getName() + "文件复制完毕");
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
        OperateFile of = new OperateFile();
        of.superCopyFile(new File("D://test//AeroGlass"),"F:");
    }
}
