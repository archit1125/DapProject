package Composite;
import Dogs.Dog;
import java.util.ArrayList;
import java.util.Iterator;

public class Pack extends Dog {
    ArrayList<Dog> dogs=new ArrayList<>();
    public void add(Dog dog)
    {
        dogs.add(dog);
    }
    public void getHeight(){
        Iterator<Dog> iterator=dogs.iterator();
        while(iterator.hasNext())
        {
            Dog dog=iterator.next();
            dog.getHeight();
        }
    }


    public void bark()
    {
        Iterator<Dog> iterator=dogs.iterator();
        while(iterator.hasNext())
        {
            Dog dog=iterator.next();
            dog.bark();

        }
        notifyObserver();
    }

    @Override
    public void getBreed() {
        Iterator<Dog> iterator=dogs.iterator();
        while(iterator.hasNext())
        {
            Dog dog=iterator.next();
            dog.getBreed();
        }
    }
}
