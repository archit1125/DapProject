package Adapter;

import Dogs.Dog;

public class CatAdapter extends Dog {
    Cat cat;

    public CatAdapter(Cat cat)
    {
        this.cat=cat;
    }
    @Override
    public void bark() {
        cat.meow();
    }

    @Override
    public void getHeight() {
       cat.getHeight();
    }

    @Override
    public void getBreed() {
        System.out.println("This is a cat");

    }
}
