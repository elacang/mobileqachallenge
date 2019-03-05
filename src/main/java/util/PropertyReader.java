package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Get property value from file
 */
public class PropertyReader {

    private static final String PROP_FILE = "/test.properties";

    public static String readProperty(String name) {
        Properties props = new Properties();
        try {
            props.load(PropertyReader.class.getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = "";

        if (name != null) {
            value = props.getProperty(name);
            return value;
        } else {
            return value;
        }
    }


    public static String getProperty(String name) {
        Properties props = new Properties();
        String value = null;
        File file;
        FileInputStream inputStream = null;
        try {

            file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + PROP_FILE);
            inputStream = new FileInputStream(file);

            props.load(inputStream);


            if (name != null) {
                value = props.getProperty(name);
            } else {
                value = "";
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return value;
    }

    public static File getReportConfigPath() {
        File file = null;
        file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "extent-config.xml");
        return file;
    }
}
