package atmsystem;

import java.util.HashMap;

public class AtmDao {
    //DAO作为一个层次--持久层  操作数据 负责读写数据
    private FileLoaderAndCommit flac = new FileLoaderAndCommit("src\\atmsystem\\User.txt");
    //一行记录 创建一个对象存储起来 一个人 一个对象 三个属性
    private HashMap<String, User> userBox = flac.loadFile();

    //设计一个方法，为所有的方法服务
    public User selectOne(String aname) {
        return userBox.get(aname);//这里是一行，如果不是一行的时候，只要修改这个方法就可以
    }

    //一个方法，为了将一个修改完毕的对象存入集合
    public void update(User user) {
        userBox.put(user.getAname(), user);//集合做了修改
        flac.commit(userBox);
    }
}
