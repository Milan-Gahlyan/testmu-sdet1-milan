package com.testmu.config;

import com.testmu.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties properties = new Properties();

    static {

        try {

            FileInputStream file =
                    new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH);

            properties.load(file);

        } catch (IOException e) {

            throw new RuntimeException(
                    "Unable to load config.properties", e);

        }

    }

    private ConfigReader() {
    }

    public static String get(String key) {

        return properties.getProperty(key);

    }

}