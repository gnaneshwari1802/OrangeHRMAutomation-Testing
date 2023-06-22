package Base;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static jdk.internal.jmod.JmodFile.Section.CONFIG;

public class TestBase {

    public static WebDriver driver = null;

    public int random;
    public void initialize() throws IOException {
        if (driver == null){
            // This code will read the config property file
            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "src/main/java/config.properties");
            CONFIG.load(fn);

            // Initialize the WebDriver

        }
    }
}
