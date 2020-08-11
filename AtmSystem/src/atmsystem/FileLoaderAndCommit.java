package atmsystem;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class FileLoaderAndCommit {

    private String fileName = null;

    public FileLoaderAndCommit(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<String, User> loadFile() {
        HashMap<String, User> userBox = new HashMap<String, User>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(fileName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String value = bufferedReader.readLine();
            while (value != null) {
                //1.value的信息拆分为三段，2.构建一个User对象，3.三个对象刚好储存，对象存入集合
                String[] userValue = value.split("-");
                User user = new User(userValue[0], userValue[1], Float.parseFloat(userValue[2]));
                userBox.put(user.getAname(), user);//put(账号,User对象)
                value = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return userBox;
    }

    //将集合内所有的数据全部写入文件，文件内的内容全部替换掉
    public void commit(HashMap<String, User> userBox) {
        //创建一个字符型文件输出流
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        File file = new File(fileName);
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Iterator<String> names = userBox.keySet().iterator();
            while (names.hasNext()) {
                String name = names.next();//集合内获取的某一个人名
                User user = userBox.get(name);//记录一个人的真实数据
                //将user对象中的真实数据拼接成一行字符串
                StringBuilder builder = new StringBuilder();
                builder.append("-");
                builder.append(user.getApassword());
                builder.append("-");
                builder.append(user.getAbalance());
                //字符型文件输出流将拼接好的builder写入文件
                bufferedWriter.write(builder.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
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
}
