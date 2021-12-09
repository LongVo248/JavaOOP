package Polymorphism;

public class AsianCat extends Cat {
    public AsianCat(String name, int age, int height){
        super(name,age,height);
    }

    @Override
    public String getAnimalName() {
        return "AsianCat";
    }
}
