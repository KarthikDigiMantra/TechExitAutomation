package com.webautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Broker {

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
            driver.findElementByName("txtusername").sendKeys("tester55");

            driver.findElementByName("txtpassword").sendKeys("tester55");
            
            

            //Login Button
            driver.findElementByName("loginBtn").click();
            
            Thread.sleep(1000);
            
          
           
//            driver.findElementByClassName("nav-advice").click();
//
//           driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/addAdvice']").click();
//
//            Thread.sleep(2000);
//        
//              driver.findElementByName("title").sendKeys("Test Advice");
//              driver.findElementByName("description").sendKeys("Test Advice");
//              Thread.sleep(2000);
//               driver.findElementById("submitbutton").click();
//          
//
//                      driver.findElementByClassName("myprofile").click();
//                      
//  driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/profile-edit/336']").click();
//
//           Thread.sleep(2000);
//
//           driver.findElementByClassName("myprofile").click();
//
//           driver.findElementByXPath("//a[@href ='/techexitgit/public/investor/message-admin']").click();
//            Thread.sleep(2000);
//
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//              js.executeScript("window.scrollBy(0, 1150)", "");
//                Thread.sleep(2000);
//                             // driver.findElementByClassName("message-admin-details").click();
//           // Thread.sleep(2000);
//
//                     driver.findElementById("adminMsgReply").click();
//                     Thread.sleep(2000);
//          
//                     driver.findElementByName("msgSubject").sendKeys("Test Message");   
//                     driver.findElementByName("adminMsg").sendKeys("Test Message");
//                      Thread.sleep(2000);
//
//                      driver.findElementById("submitbutton").click();
//

//sub element
//                      WebElement target =driver.findElement(By.xpath("//a[text()='My Profile']"));
//WebElement target1 =driver.findElement(By.xpath("//a[text()='My Profile']"));
//Actions a=new Actions(driver);
//a.moveToElement(target);
//a.click(target1);
//a.build().perform();
driver.findElementByClassName("rec-offer").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/recommendedOffer']").click();
                    Thread.sleep(2000);
  //driver.findElementByXPath("//a[@href ='/techexitgit/public/investor/message-admin']").click();
//            driver.findElementByClassName("message-admin-details").click();
//
//          // Thread.sleep(2000);
//                   //  driver.findElementById("adminMsgReply").click();
//                     Thread.sleep(2000);
//          
//                     driver.findElementByName("adminMsg").sendKeys("Test Message");
//                    // driver.findElementByName("adminMsg").sendKeys("Test Message");
//                     Thread.sleep(2000);
//                      driver.findElementById("submitbutton").click();
//             driver.findElementById("sendOffer").click();
//           driver.findElementByName("email_addr").sendKeys("innovatortechexit@gmail.com");
//                       driver.findElementById("submitbutton").click();
//           Thread.sleep(2000);
//           
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/view?id=GODREB82F9&uid=239']").click();
//                    Thread.sleep(2000);
//                                  driver.findElementByClassName("deal-box-corner").click();
//                    Thread.sleep(2000);
//                                driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/recommendedOffer']").click();
//                    Thread.sleep(2000);
            // driver.findElementById("submitbutton").click();
           //Thread.sleep(2000);

           
//           driver.findElementByClassName("rec-offer").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/matchMoreOffers']").click();
//
//           Thread.sleep(2000);
           
           driver.findElementByClassName("paypal").click();
           
             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/payment/336']").click();

           Thread.sleep(2000);
           
               driver.findElementById("button").click();

               Thread.sleep(2000);

               driver.findElementById("payButton").click();
                Thread.sleep(14000);

                     driver.findElementByName("email").sendKeys("innovatortechexit@gmail.com");
                Thread.sleep(2000);
                     driver.findElementByName("cardNumber").sendKeys("4242424242424242");
                                     Thread.sleep(2000);

                     driver.findElementByName("cardExpiry").sendKeys("01/30");
                                     Thread.sleep(2000);

                     driver.findElementByName("cardCvc").sendKeys("123");
                                     Thread.sleep(2000);

                     driver.findElementByName("billingName").sendKeys("Karthik");
                                     Thread.sleep(2000);

                     Select dropdown = new Select(driver.findElement(By.id("billingCountry")));
                                          dropdown.selectByVisibleText("United States");
                                Thread.sleep(2000);
                     driver.findElementByName("billingPostalCode").sendKeys("20010");
                      Thread.sleep(2000);
                      
                      JavascriptExecutor js = (JavascriptExecutor)driver;
                              js.executeScript("window.scrollBy(0, 900)", "");
Thread.sleep(2000);
              driver.findElementByClassName("SubmitButton-IconContainer").click();


                                                 Thread.sleep(10000);
        driver.navigate().to("http://localhost/techexitgit/public/proposal/addoffer");
             //driver.findElementByXPath("//a[@href ='/techexitgit/public/proposal/add/366']").click();
//*[@id="main-container"]/div/div/div/div[3]/div/div[2]/h4/a
                                     Thread.sleep(2000);
                  //driver.findElementById("addoffer").click();


                                driver.findElementByName("businessname").sendKeys("horlicks");
                                     Thread.sleep(2000);

//        WebElement upload_file = driver.findElement(By.xpath("//input[@id='file_up']"));
//
//        upload_file.sendKeys("C:/Users/Sonali/Desktop/upload.png");
                                   //  Thread.sleep(2000);
                                driver.findElementByName("managementlocation").sendKeys("chennai");
                                     Thread.sleep(2000);
                                driver.findElementByName("website").sendKeys("www.tester.com");
                                     Thread.sleep(2000);
                               //Select dropdown1 = new Select(driver.findElement(By.id("noofemployees")));
                                 //         dropdown1.selectByVisibleText("41-60");
                                   //  Thread.sleep(2000);

                                driver.findElementByName("city").sendKeys("chennai");
                                     Thread.sleep(2000);
                                driver.findElementByName("state").sendKeys("tamilnadu");
                                     Thread.sleep(2000);
                                driver.findElementByName("zipcode").sendKeys("600100");
                                     Thread.sleep(2000);
                           Select dropdown2 = new Select(driver.findElement(By.id("country")));
                                          dropdown2.selectByVisibleText("India");
                                                                               Thread.sleep(2000);

                     Select dropdown3 = new Select(driver.findElement(By.id("language")));
                                          dropdown3.selectByVisibleText("English");
                                     Thread.sleep(2000);
                  driver.findElementById("brk_proposal-tab").click();
                                                       Thread.sleep(2000);
                                     
                                driver.findElementByName("proposalname").sendKeys("horlicks");
                                    Thread.sleep(2000);
                                driver.findElementByName("proposaltitle").sendKeys("horlicks");
                                    Thread.sleep(2000);
                                driver.findElementByName("proposalsummary").sendKeys("horlicks");
                                    Thread.sleep(2000);
                                                         // driver.findElementByClassName("panel-title").click();
//                                                                           driver.findElementById("marketsize_1").click();
//
//
//                                                                        Thread.sleep(2000);
//
//                             driver.findElementByName("productname").sendKeys("Karthik");
//                                   Thread.sleep(2000);
//
//                        
//                     Select dropdown4 = new Select(driver.findElement(By.id("productstage")));
//                                          dropdown4.selectByVisibleText("Finished Product");
//                                     Thread.sleep(2000);
//                                     driver.findElementByName("productdescription").sendKeys("horlicks");
//                                   Thread.sleep(2000);

                                //driver.findElementByName("website").sendKeys("www.tester.com");
                                  //   Thread.sleep(2000);

                                //driver.findElementByName("website").sendKeys("www.tester.com");
                                  //   Thread.sleep(2000);
                                  driver.findElementById("brk_funding-tab").click();
                                                       Thread.sleep(2000);

                                   driver.findElementById("brk_uploads-tab").click();
                                                       Thread.sleep(2000);

                                          
                  //driver.findElementById("previewbutton").click();
                                                //       Thread.sleep(2000);

               driver.findElementById("savebutton").click();


           
//                      driver.findElementByClassName("admin").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/admin?page=1']").click();
//
//           Thread.sleep(2000);
//                         driver.findElementByClassName("admin").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/entrepreneur/adduser']").click();
//
//           Thread.sleep(2000);

                         driver.findElementByClassName("proposals").click();

             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/proposals']").click();

           Thread.sleep(2000);
//  driver.findElementByClassName("proposals").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/index/336']").click();
//
//           Thread.sleep(2000);
//            driver.findElementByClassName("interested").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/interestedInvestors']").click();
//
//           Thread.sleep(2000);
//            driver.findElementByClassName("interested").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/interestedBrokers']").click();
//
//           Thread.sleep(2000);
//           driver.findElementByClassName("nav-advice").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/addAdvice']").click();
//
//           Thread.sleep(2000);
//           
//           
//           // my advice 
//           driver.findElementByName("title").sendKeys("Test Advice");
//           driver.findElementByName("description").sendKeys("Test Advice");
//           Thread.sleep(2000);
//           driver.findElementById("submitbutton").click();
//           Thread.sleep(2000);
//         
//            driver.findElementByClassName("support").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/faq']").click();
//
//           Thread.sleep(2000);
//            driver.findElementByClassName("support").click();
//
//             driver.findElementByXPath("//a[@href ='/techexitgit/public/broker/help']").click();
//
//           Thread.sleep(2000);
//           driver.findElementByClassName("myprofile").click();
//
//             //driver.findElementByXPath("//a[@href ='/techexitgit/public/investor/message-admin']").click();
//
//           Thread.sleep(2000);
//             JavascriptExecutor js = (JavascriptExecutor)driver;
//              js.executeScript("window.scrollBy(0, 1150)", "");
//                Thread.sleep(2000);
//                     driver.findElementById("adminMsgReply").click();
//                     Thread.sleep(2000);
//          
//                     driver.findElementByName("msgSubject").sendKeys("Test Message");
//                     driver.findElementByName("adminMsg").sendKeys("Test Message");
//
//                      driver.findElementById("submitbutton").click();
//           Thread.sleep(2000);
 
                      //driver.findElementByClassName("logout").click();

           //driver.close();
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
