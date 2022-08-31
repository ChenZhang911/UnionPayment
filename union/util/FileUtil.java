package com.changyou.tools.payment.union.util;

import java.io.InputStream;

public class FileUtil {

    public InputStream getInputStream(String path){
            InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(path);
            if (null == resourceAsStream){
                System.out.println("!!!!!!!!!!!!!!!!!!      null           !!!!!!!!!!!!!!!!!");
            }

            return resourceAsStream;
    }
}
