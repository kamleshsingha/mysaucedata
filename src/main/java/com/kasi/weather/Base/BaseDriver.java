package com.kasi.weather.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    WebDriver driver;

    public WebDriver driverInit() {
        String basepath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", basepath + "//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }


    public String url() throws IOException {
        File file = new File(System.getProperty("user.dir") + "//test//resources//file.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fis);
        String url = properties.getProperty("url");
        return url;


    }
}
