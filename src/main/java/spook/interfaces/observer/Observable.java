package spook.interfaces.observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void adviseObserver(Observer observer) throws Exception;

}
