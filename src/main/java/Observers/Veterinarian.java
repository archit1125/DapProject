package Observers;
import Observables.Observable;


public class Veterinarian implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println(this + " "+ observable+ " just barked");
    }
}
