package BreedFactorys;

import Barks.Bark;
import Barks.SoftBark;
import Dogs.Dog;
import Dogs.GermanShepherd;
import Heights.Height;
import Heights.MediumHeight;

public class GermanShepherdFactory extends BreedFactory {
    @Override
    public Dog createDog() {
        Dog dog=new GermanShepherd();
        dog.setBark(getBark());
        dog.setHeight(getHeight());
        return dog;
    }
    public Bark getBark()
    {
        return new SoftBark();
    }
    public Height getHeight()
    {
        return new MediumHeight();
    }
}
