package DogFactory;

import BreedFactorys.BreedFactory;
import Dogs.Dog;

public class DogFactory implements AbstractDogFactory {
    @Override
    public Dog createDog(String breed) {
        BreedFactory factory=BreedFactory.getFactory(breed);
        return factory.createDog();
    }
}
