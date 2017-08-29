package io.sujan.springbootfile.file_api.utils;

import java.io.IOException;
import java.util.Properties;

public final class PropUtil {

    public static Properties getProps(String filename){
     Properties properties = new Properties();
        try {

            properties.load(ClassLoader.getSystemResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }
}