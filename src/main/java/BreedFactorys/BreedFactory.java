package BreedFactorys;

import Barks.Bark;
import Dogs.Dog;
import Heights.Height;

public abstract class BreedFactory {

     public static BreedFactory getFactory(String breed)
    {
        if(breed.equalsIgnoreCase("Bull Dog"))
            return new BullDogFactory();
        if(breed.equalsIgnoreCase("Poodle"))
            return new PoodleFactory();
        if(breed.equalsIgnoreCase("German Shepherd"))
            return new GermanShepherdFactory();

        return null;

    }
    public abstract Dog createDog();
    public abstract Bark getBark();
    public  abstract Height getHeight();

}
