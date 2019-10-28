package spook.source.utils;


import java.util.Date;

public class UtilsTimer extends Thread{

    private boolean ifFinish ;
    private int milliseconds;
    private boolean ifTrueTime;

    public UtilsTimer(){
        this.ifFinish = false;
    }

    public void setTimer(int milliseconds){

        this.milliseconds = milliseconds;
        setIfFinish(true);
        this.setPriority(7);
        this.start();


    }

    public void setIfFinish(boolean ifFinish){
        this.ifFinish = ifFinish;
    }
    public boolean getIfFinish(){
        return this.ifFinish;
    }

    public void killTimer() throws Exception{
        setIfFinish(false);
        this.stop();
    }

    @Override
    public void run() {
        int startTime = new Date().getSeconds();
        int finishTime = startTime + this.milliseconds;
        if(finishTime > 59)
            finishTime = finishTime - 60;


        while(new Date().getSeconds() != finishTime){
            if (!getIfFinish()){
                this.ifTrueTime = false;
                break;
            }

        }

        try {
            this.ifTrueTime = true;
            killTimer();
        } catch (Exception e) {
            //Timer Log Kaydı Olacak
        }
    }



}
