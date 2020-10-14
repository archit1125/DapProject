package Observables;
import Dogs.Dog;
import Observers.Observer;

import java.util.ArrayList;
import java.util.Iterator;


public class BarkObservable implements Observable {
    ArrayList<Observer> observers=new ArrayList<>();
    Observable dog;
    public BarkObservable(Observable dog)
    {
        this.dog=dog;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> iterator=observers.iterator();
        while(iterator.hasNext())
        {
            Observer observer=iterator.next();
            observer.update(dog);
        }

    }
}
