package util;

import java.io.FileInputStream;
import java.util.Properties;

public final class ConfigManager {

    private final Properties props = new Properties();

    public ConfigManager() {
        String env = System.getProperty("env", "qa");
        try (FileInputStream fis = new FileInputStream("src/main/java/resources/config/" + env + ".properties")) {
            props.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load properties for env: " + env, e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

}
