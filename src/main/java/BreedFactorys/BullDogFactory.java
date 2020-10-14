package BreedFactorys;

import Barks.Bark;
import Barks.HardBark;
import Dogs.BullDog;
import Dogs.Dog;
import Heights.Height;
import Heights.LargeHeight;

public class BullDogFactory extends BreedFactory {

    public Dog createDog()
    {
        Dog dog=new BullDog();
        dog.setBark(getBark());
        dog.setHeight(getHeight());
        return dog;
    }

    public Bark getBark()
    {
        return new HardBark();
    }
    public Height getHeight()
    {
        return new LargeHeight();
    }

}
