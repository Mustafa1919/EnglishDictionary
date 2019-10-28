package spook.source.start;

import spook.source.gui.mainpage;
import spook.source.utils.Logs;
import spook.source.utils.UtilsFilePath;
import spook.source.utils.UtilsTimer;

public class StartProje {
    public static void main(String[] args) {
        //mainpage page = new mainpage();
        System.out.println(UtilsFilePath.filePath);

        System.out.println(UtilsFilePath.osName);

        try {
           new UtilsTimer().setTimer(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
