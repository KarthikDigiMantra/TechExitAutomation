package com.webautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Admin {

	public static void main(String[] args) throws InterruptedException {
            // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");
            
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);


            ChromeDriver driver = new ChromeDriver(capabilities);
            
            driver.navigate().to("http://localhost/techexitgit/public/user/");
            driver.manage().window().maximize();

            Thread.sleep(1000);
            driver.findElementByName("txtusername").sendKeys("KARTHIKPHP");

            driver.findElementByName("txtpassword").sendKeys("0d9d94fe1a6");
            
            

            //Login Button
            driver.findElementByName("loginBtn").click();
            
            Thread.sleep(1000);
            
          
//           
//            driver.findElementByClassName("nav-advice").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/addAdvice']").click();
//
//           Thread.sleep(2000);
//           
//           driver.findElementByName("title").sendKeys("Test Advice");
//           driver.findElementByName("description").sendKeys("Test Advice");
//           Thread.sleep(2000);
//           driver.findElementById("submitbutton").click();
           
           driver.findElementByClassName("message").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/admin/message-admin-investor']").click();

           Thread.sleep(2000);
                    driver.findElementByClassName(" message-admin-details").click();
                  driver.findElementByClassName(" cnt viewCnt<?php echo $msg['id'];?> cancel hide").click();
           driver.findElementById("commTable tbody").click();
           driver.findElementById("replyTable tbody").click();

                 
                  driver.findElementByName("adminMsg").sendKeys("Test Msg");

//           driver.findElementByName("Account #").sendKeys("Test Advice");
//           driver.findElementByName("Investor's Name").sendKeys("Test Advice");
//            driver.findElementByName( "Investor's Communication Details").sendKeys("Test Advice");
//             driver.findElementByName("Date & Time").sendKeys("Test Advice");
//              driver.findElementByName("Action").sendKeys("Test Advice");
           Thread.sleep(2000);
           driver.findElementById("submitbutton").click();
//          WebElement source1 = driver.findElementById("nav-recommendedOffer");
//            Select dropdown1 = new Select(source1);
//            dropdown1.selectByIndex(1);
//
//            WebElement source2 = driver.findElementById("nav-matchMoreOffers");
//            Select dropdown2 = new Select(source2);
//            dropdown2.selectByIndex(2);
//            driver.findElementByName("firstname").sendKeys("Karthi");
//            driver.findElementByName("lastname").sendKeys("B");
//            driver.findElementByName("pincode").sendKeys("600042");
//            driver.findElementByName("mobile_num").sendKeys("9123456789");
//            driver.findElementByName("address1").sendKeys("2/21 1st street");
////
//    /*	WebElement source3 = driver.findElementById("country");
//            Select dropdown3 = new Select(source3);
//            dropdown3.selectByVisibleText("India"); */
//
//            WebElement source4 = driver.findElementById("state");
//            Select dropdown4 = new Select(source4);
//            dropdown4.selectByVisibleText("Tamil Nadu");
//
//
//            WebElement source5 = driver.findElementById("pickup_details");
//            Select dropdown5 = new Select(source5);
//            dropdown5.selectByIndex(1);
//
//            driver.findElementByName("product_name").sendKeys("Test");
//            driver.findElementByName("quantity").sendKeys("1");
//            driver.findElementByName("price").sendKeys("2");
//            driver.findElementByName("length").sendKeys("1");
//            driver.findElementByName("width").sendKeys("1");
//            driver.findElementByName("height").sendKeys("2");
//            driver.findElementByName("volumetric_weight").sendKeys("0.0016");
//            driver.findElementByName("weight").sendKeys("0.5");
//
//            driver.findElementById("calculate_btn").click();
//
//            Thread.sleep(1000);
//
//            driver.findElementById("courier_sumbit").click();
//            driver.findElementById("calculate_btn").click();
//            Thread.sleep(1000);
//
//             driver.findElementById("courier_sumbit").click();
//             Thread.sleep(1000);
//             driver.findElementByName("sub_frm").click();

            // driver.findElementByXPath("//*[@value=\"Submit\"]").click();
           //  driver.findElementByXPath("//*[@id=\"order_create\"]/div[2]/input").click();
             
	}

}
