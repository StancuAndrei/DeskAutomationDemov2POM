package desktopObjects;

import base.Base;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePadObject extends Base {

    WindowsElement notepad_help_button =  driver.findElementByName("Help");


    WindowsElement notepad_about_notepad_button =  driver.findElementByName("Format");



    public boolean click_help_button(){
        boolean flag = false;
        try{
            notepad_help_button.click();
            notepad_about_notepad_button.click();
            flag = true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return flag;
    }




}
