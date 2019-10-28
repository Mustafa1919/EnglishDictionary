package spook.source.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logs extends Thread {

    private String message;


    public void startLog(String message) throws Exception{
        this.message = message;
        this.setPriority(3);
        this.start();
    }

    @Override
    public void run() {
        // Log kayıtları Tutulcak

        killThread();
    }

    private void killThread(){
        this.stop();
        this.message = "";
    }


    @Override
    public String toString() {
        return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()) + "-------->" + this.message;
    }
}
