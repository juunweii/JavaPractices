package com.juunweii.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {


//        File jkdir = new File("Desktop:\\jk");
//        jkdir.mkdir();
//        FileWriter fw = new FileWriter("Desktop:\\jk\\output.txt");
        FileWriter fw = new FileWriter("output.txt"); //在專案中產生檔案
        fw.write("abc");
        fw.flush();
        fw.close();

    }
}
