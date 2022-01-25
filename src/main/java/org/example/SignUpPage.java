package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SignUpPage extends Utils{

     Actions actions = new Actions(driver);

     By _text_FirstName = By.xpath("//input[@name='firstname']");
     By _text_LastName = By.xpath("//input[@name='lastname']");
     By _btn_Gender = By.xpath("//input[@value='Male']");
     By _btn_YearsOfExperience = By.id("exp-1");
     By _btn_PopUpsGotIt = By.xpath("//a[@class='cc_btn cc_btn_accept_all']");
     By _btn_Ok = By.xpath("//*[@id=\"cookieChoiceDismiss\"]");
     By _txt_DateOfExperience = By.id("datepicker");
     By _btn_ProfessionManual = By.name("profession");
     By _drp_Continent = By.id("continents");
     By _btn_ChooseFile = By.id("photo");
     By _btn_DownloadFile = By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div[29]/div[2]/div/a");




     public void userEntersFirstNameAndLastName(){
          typeText(_text_FirstName, loadProp.getProperty("FirstName"));
     }
     {typeText(_text_LastName, loadProp.getProperty("LastName"));}

     public void userFillsUpPersonalDetails() {
          clickOnElement(_btn_Gender);
          clickOnElement(_btn_YearsOfExperience);
          clickOnElement(_btn_PopUpsGotIt);
          clickOnElement(_btn_Ok);
          typeText(_txt_DateOfExperience, loadProp.getProperty("DateOfExperience"));
          clickOnElement(_btn_ProfessionManual);
          // clickOnElement(_drp_Continent);
          actions.moveToElement(driver.findElement(_drp_Continent)).click().perform();
          typeText(_drp_Continent, loadProp.getProperty("Continents"));



          Select drpCommands = new Select(driver.findElement(By.id("selenium_commands")));
          drpCommands.selectByVisibleText("Browser Commands");



     }

     public void userIsAbleToUploadFile() {
          driver.findElement(_btn_ChooseFile).sendKeys("C:\\Users\\bhawa\\OneDrive\\Desktop\\My CV\\cv_BhawanaSatyalST1.docx");
     }
//     public void userIsAbleToDownloadFile(){
//        clickOnElement(_btn_DownloadFile);
//        // driver.switchTo().alert();
//        //  driver.findElement(By.xpath("/html/body")).click();
//         // driver.findElement(By.id("//*[@id=\"dismiss-button\"]/div/span")).click();
//
//       //   driver.switchTo().frame(driver.findElement(By.id(locatorToIdentifyFrame)));
//          driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[1]")));
//          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//      //    driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
//          driver.findElement(By.xpath("//div[2]/div[2]/div/div/div[2]/div/div/div[3]/div/span")).click();
//          driver.switchTo().defaultContent(); // Return to main window


          }









//          public void handleWindow() {
//               Set<String> windowhandles = driver.getWindowHandles();
//               Iterator<String> iterator = windowhandles.iterator();
//               String parentwindow = iterator.next();
//               String childwindow = iterator.next();
//               driver.switchTo().window(childwindow);
//               driver.close();
//               driver.switchTo().window(parentwindow);
//               clickOnElement(_btn_Ok);







