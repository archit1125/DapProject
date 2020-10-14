package Decorator;

import Dogs.Dog;
public class DogCounter extends Dog {
    Dog dog;
    static int count=0;

    public DogCounter(Dog dog)
    {
        this.dog=dog;
        count++;
    }

    @Override
    public void bark() {
        dog.bark();
        notifyObserver();
    }

    @Override
    public void getHeight() {
        dog.getHeight();
    }

    @Override
    public void getBreed() {
        dog.getBreed();
    }

    public static int getCount()
    {
        return count;
    }
}
