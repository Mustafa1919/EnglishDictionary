package spook.source.utils;

import spook.interfaces.observer.Observer;
import spook.source.observer.NoticeObservable;

import java.util.Date;


public class UtilsTimer extends Thread implements Observer {


    private boolean ifFinish ;
    private int milliseconds;
    private boolean ifTrueTime;
    private NoticeObservable noticeObservable = null;


    public UtilsTimer(){
        if(noticeObservable == null)
            noticeObservable = NoticeObservable.getNoticeObservable();
        noticeObservable.addObserver(this);

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
        noticeObservable.removeObserver(this);
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
                noticeObservable.adviseObserver(this);
                break;
            }
        }

        try {
            this.ifTrueTime = true;
            killTimer();
        } catch (Exception e) {

            //Timer killing error will be loged

        }
    }



    public void advise() {
        //Noting Doing
    }

}
