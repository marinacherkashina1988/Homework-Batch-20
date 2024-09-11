package org.example.e198;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ConfigurationFiles {
    public static class ConfigReader {

        static Properties properties;

        public ConfigReader(String path) {
            try {
                FileInputStream fis = new FileInputStream(path);
                properties = new Properties();
                properties.load(fis);
                fis.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        public String getBrowser() {
            return properties.getProperty("browser");
        }

        public String getUrl() {
            return properties.getProperty("url");
        }

        public int getImplicitWait() {
            return Integer.parseInt(properties.getProperty("implicitWait"));
        }

        public static WebDriver openBrowser (String browser, String url, int implicitWait) throws InterruptedException {

            WebDriver driver= null;

            switch (browser){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("Browser type is not supported");
            }

            Thread.sleep(implicitWait);
            driver.get(url);
            return driver;
        }
    }
    public static void main(String[] args) throws InterruptedException {

        String path = "C:\\Users\\ahmed\\IdeaProjects\\HomeworkBatch20\\src\\Files\\config.properties";

        ConfigReader conf = new ConfigReader(path);

        String browser = conf.getBrowser();
        String url = conf.getUrl();
        int implicitWait = conf.getImplicitWait();

        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        System.out.println("Implicit Wait: " + implicitWait + " seconds");

        WebDriver driver = ConfigReader.openBrowser(browser, url, implicitWait);
        driver.quit();

    }
}
