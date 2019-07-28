package manage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProjectProperties {
    public static Properties properties = new Properties();

    public static void readProperties() {

        try {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("src/main/resources/");

            if (System.getProperty("env") != null) {
                stringBuilder.append(System.getProperty("env"));
            } else {
                stringBuilder.append("environment.169");
            }

            stringBuilder.append(".properties");

            FileInputStream file = new FileInputStream(stringBuilder.toString());
            properties.load(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
