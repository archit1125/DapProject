package Observables;

import Observers.Observer;

public interface Observable {
    public void addObserver(Observer observer);
    public void notifyObserver();
}
