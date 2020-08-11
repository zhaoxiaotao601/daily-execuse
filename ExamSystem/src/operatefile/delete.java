package operatefile;

import java.io.File;

public class delete {
    public void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.deleteFile(f);
            }
        }
        file.delete();
        System.out.println("删除成功");
    }

    public static void main(String[] args) {
        delete delete = new delete();
        File file = new File("D://test//AeroGlass");
        delete.deleteFile(file);
    }
}
