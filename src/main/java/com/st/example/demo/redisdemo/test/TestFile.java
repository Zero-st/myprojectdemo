package com.st.example.demo.redisdemo.test;

import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestFile {


    static String  classpath ;

    public static void main(String[] args) {
        String MyPath="F:/ceshi";

        try {
             classpath = ResourceUtils.getURL("classpath:").getPath();
            System.out.println(classpath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File(MyPath);

        if(!file.exists()){
            //file.mkdir();

            //创建文件夹
            file.mkdirs();


            //写入文件
        }

        String FileMyPath=MyPath + "/1.text";
        //类似windows当前路径操作对象，可以创建文件夹和文件
        File file1 = new File(FileMyPath);
        if(file1.exists()){
            System.out.println("文件已存在");

        }else{
            try {
                //创建文件
                boolean newFile = file1.createNewFile();
                System.out.println(newFile);
                System.out.println("创建文件成功!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //文件输入输出流
        FileInputStream fileInputStream = null;

        //文件输出流
        FileOutputStream fileOutputStream1=null;

        try {

            Scanner scanner = new Scanner(System.in);
            fileOutputStream1 = new FileOutputStream(file1);
            fileOutputStream1.write(scanner.next().getBytes(StandardCharsets.UTF_8));


         /*   fileInputStream = new FileInputStream(FileMyPath);

            byte[] bytes = new byte[1024];
            int read = fileInputStream.read(bytes);

            System.out.println(read);
*/



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //释放资源
               // fileInputStream.close();
                fileOutputStream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}
