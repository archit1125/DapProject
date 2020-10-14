package Dogs;

import Barks.Bark;
import Heights.Height;
import Observables.BarkObservable;
import Observables.Observable;
import Observers.Observer;


public abstract class Dog implements Observable {
    BarkObservable barkObservable;
    Bark bark;
    Height height;

    public Dog() {
        barkObservable = new BarkObservable(this);
    }

    @Override
    public void addObserver(Observer observer) {
        barkObservable.addObserver(observer);
    }

    @Override
    public void notifyObserver() {
        barkObservable.notifyObserver();
    }

    public void getHeight() {
        height.getHeight();
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public void bark() {
        bark.bark();

    }

    public void setBark(Bark bark) {
        this.bark = bark;
    }

    public abstract void getBreed();
}
