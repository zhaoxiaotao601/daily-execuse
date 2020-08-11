package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToDoc {
    //执行写入
    File file = new File("F:\\");
    BufferedWriter bufferedWriter=null;

    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
