package spook.source.observer;

import spook.interfaces.observer.Observable;
import spook.interfaces.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable {

    private List<Observer> observerList = null;
    private static NoticeObservable noticeObservable = null;

    private NoticeObservable(){
        if(observerList == null)
            observerList = new ArrayList<Observer>();
    }

    public static NoticeObservable getNoticeObservable(){
        if (noticeObservable == null)
            noticeObservable = new NoticeObservable();
        return noticeObservable;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer); // to the Users add observer
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer); // to the Users delete observer
    }


    /*
      @This method uses to inform of other client
     */
    public void adviseObserver(Observer observer) {
//        if (observerList.contains(observer))
//            observer.advise();
//        else
//            throw new Exception("Kayıt Bulunamadi");
        for (Observer obs : observerList){
            obs.advise();
        }
    }
}
