package com.tretiakovdim.app.classwork.lesson14;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by DmitryTretiakov on 07.12.2016.
 */
public class FirstWebDriverTestB {
By searchField=By.name("q");
//By searchResultElementsLink =By.xpath("//*[@class='g']//a");
        @Test
        public void FirstWebDriverTest() {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://google.com");
            WebElement searchInput = driver.findElement(searchField);
            searchInput.sendKeys( "Monkey");
            searchInput.submit();
                        try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            List<WebElement> linkList = driver.findElements(By.xpath("//*[@class='g']//a"));
            System.out.println(linkList.size());
            Assert.assertTrue(linkList.get(0).getText().contains("Monkey"));
        }


    }

