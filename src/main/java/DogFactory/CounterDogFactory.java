package DogFactory;

import BreedFactorys.BreedFactory;
import Decorator.DogCounter;
import Dogs.Dog;

public class CounterDogFactory implements AbstractDogFactory {
    @Override
    public Dog createDog(String breed) {
        BreedFactory factory=BreedFactory.getFactory(breed);
        Dog dog= new DogCounter(factory.createDog());
        return dog;
    }
}
