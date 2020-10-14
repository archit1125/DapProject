package DogFactory;

import Dogs.Dog;

public interface AbstractDogFactory {
    public abstract Dog createDog(String breed);
}
