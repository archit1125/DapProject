package BreedFactorys;

import Barks.Bark;
import Barks.SoftBark;
import Dogs.Dog;
import Dogs.Poodle;
import Heights.Height;
import Heights.SmallHeight;

public class PoodleFactory extends BreedFactory {

    @Override
    public Dog createDog() {
        Dog dog=new Poodle();
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
        return new SmallHeight();
    }
}


