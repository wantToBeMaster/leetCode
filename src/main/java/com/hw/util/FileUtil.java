package com.hw.util;

import org.apache.commons.lang.StringUtils;

import java.io.*;

/**
 * 逐行读取txt文件内容
 * Created by huwei on 2021/12/22.
 */
public class FileUtil {

    public static void main(String[] args)  {
        File file = new File("C:\\Users\\RYX\\Desktop\\新建文本文档 (3).txt");
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String s;
            while(StringUtils.isNotBlank(s = reader.readLine())){
                if (s.contains("扣款数据处理结束")){
                    String[] split = s.split("msg:");
                    System.out.println(split[1].substring(0,split[1].length()-3));
                }
            }

            reader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
