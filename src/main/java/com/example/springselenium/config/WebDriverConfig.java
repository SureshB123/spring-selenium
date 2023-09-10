package com.example.springselenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.File;
import java.time.Duration;

@Configuration
public class WebDriverConfig {

    @Value("${timeOut:30}")
    public int timeOut;

    @Bean
    public WebDriver driver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setAcceptInsecureCerts(true);
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.merge(cp);
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver.exe");
        return new ChromeDriver(chromeOptions);
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        Duration timeoutDuration = Duration.ofSeconds(timeOut);
        return new WebDriverWait(driver,timeoutDuration);
    }

}
