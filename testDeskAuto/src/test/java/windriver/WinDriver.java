package windriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WinDriver {

    public static void start(){

        try{
            Desktop desktop = Desktop.getDesktop();

            File file = new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe");


            if (!Desktop.isDesktopSupported()){
                System.out.println("not supported");
                return;
            }

            if (file.exists()){
                System.out.println("Open WinAppDriver.exe\n");
                desktop.open(file);
            }

        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Encountered Exception\n");
            throw new RuntimeException();
        }

    }

    public static void stop()
    {
        try
        {
            ProcessBuilder processBuilder =new ProcessBuilder("taskkill ","/f","/IM","WinAppDriver.exe");
            processBuilder.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


}
