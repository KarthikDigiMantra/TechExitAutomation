package com.webautomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Innovator {

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
            driver.findElementByName("txtusername").sendKeys("tester44");

            driver.findElementByName("txtpassword").sendKeys("tester44");
            
            

            //Login Button
            driver.findElementByName("loginBtn").click();
            
            Thread.sleep(1000);
            
          
           
            driver.findElementByClassName("nav-advice").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/addAdvice']").click();

           Thread.sleep(2000);
           
           driver.findElementByName("title").sendKeys("Test Advice");
           driver.findElementByName("description").sendKeys("Test Advice");
           Thread.sleep(2000);
           driver.findElementById("submitbutton").click();
           
           driver.findElementByClassName("msg-inn").click();

             //driver.findElementByXPath("//a[@href ='/techexitgi/public/investor/message-admin']").click();
            Thread.sleep(2000);
          // main_replyTable
            JavascriptExecutor js = (JavascriptExecutor)driver;
              js.executeScript("window.scrollBy(0, 1150)", "");
                Thread.sleep(2000);
                     driver.findElementById("adminMsgReply").click();
 Thread.sleep(2000);
          
                     driver.findElementByName("msgSubject").sendKeys("Test Message");
                     driver.findElementByName("adminMsg").sendKeys("Test Message");

                      driver.findElementById("submitbutton").click();
           driver.findElementByClassName("myprofile").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/profileEdit/239']").click();

           Thread.sleep(2000);

driver.findElementByClassName("rec-offer").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/recommendedOffer']").click();

           Thread.sleep(2000);
           
           driver.findElementByClassName("paypal").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/payment/239']").click();

           Thread.sleep(2000);

                         driver.findElementByClassName("proposals").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/proposals']").click();

           Thread.sleep(2000);
  driver.findElementByClassName("proposals").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/index/239']").click();

           Thread.sleep(2000);
            driver.findElementByClassName("interested").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/interestedInvestors']").click();

           Thread.sleep(2000);
            driver.findElementByClassName("interested").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/interestedBrokers']").click();

           Thread.sleep(2000);
//           driver.findElementByClassName("nav-advice").click();
//
//             
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/addAdvice']").click();
//
//           Thread.sleep(2000);
//           driver.findElementByName("title").sendKeys("Test Advice");
//           driver.findElementByName("description").sendKeys("Test Advice");
//           Thread.sleep(2000);
//           driver.findElementById("submitbutton").click();
            driver.findElementByClassName("support").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/faq']").click();

           Thread.sleep(2000);
            driver.findElementByClassName("support").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/help']").click();

           Thread.sleep(2000);
           
//           driver.findElementByClassName("msg-inn").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/investor/message-admin']").click();
//
//           Thread.sleep(2000);
//                       JavascriptExecutor js = (JavascriptExecutor)driver;
//              js.executeScript("window.scrollBy(0, 1150)", "");
//                Thread.sleep(2000);
//                     driver.findElementById("adminMsgReply").click();
//                Thread.sleep(2000);
//          
//                     driver.findElementByName("msgSubject").sendKeys("Test Message");
//                     driver.findElementByName("adminMsg").sendKeys("Test Message");
//
//                      driver.findElementById("submitbutton").click();
                      driver.findElementByClassName("logout").click();

          // driver.close();
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
