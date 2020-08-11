package newtestfile;

import java.io.File;
//删除文件夹
public class TestMethod {
    public void delete(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.delete(f);
            }
        }
        file.delete();
        System.out.println("删除成功");
    }
    //遍历文件夹
//    public void showFile(File file) {
//        File[] files = file.listFiles();
//        if (files != null && files.length != 0) {
//            for (File f : files) {
//                this.showFile(f);
//            }
//        }
//        System.out.println(file.getAbsolutePath());
//    }
//    //盖宝塔
//    public void  buildTower(int floor) {
//        if(floor>1){
//            this.buildTower(floor-1);
//        }
//        System.out.println("盖到第" + floor + "层了");
//    }

    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        File file = new File("F:\\test\\AeroGlass");
        tm.delete(file);
//        tm.showFile(file);
//          tm.buildTower(9);
    }
}
