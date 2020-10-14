import Adapter.Cat;
import Adapter.CatAdapter;
import Composite.Pack;
import Decorator.DogCounter;
import DogFactory.CounterDogFactory;
import Dogs.Dog;
import Observers.Veterinarian;

public class Simulator {
    public static void main(String[] args) {

        Dog dog = new CounterDogFactory().createDog("Poodle");
        Dog dog2 = new CounterDogFactory().createDog("Bull Dog");
        Pack pack = new Pack();
        pack.add(dog);
        pack.add(dog2);
        Veterinarian vet1 = new Veterinarian();
        Veterinarian vet2 = new Veterinarian();
        pack.addObserver(vet1);
        dog.addObserver(vet1);
        dog.addObserver(vet2);


        Dog dogs = new CatAdapter(new Cat());


        dog.bark();
        dog.getBreed();
        dog.getHeight();
        pack.bark();
        System.out.println("Total no. of dogs is " + DogCounter.getCount());
    }


}

