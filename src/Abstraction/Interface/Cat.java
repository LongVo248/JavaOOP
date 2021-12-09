package Abstraction.Interface;

public class Cat extends Animal implements CanEat,CanDrink{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void back() {
        System.out.println(name + " cat back ...");
    }

    @Override
    public int getVelocity() {
        return 110;
    }

    @Override
    public void eat() {
        System.out.println(name + " cat eat ...");
    }

    @Override
    public void drink() {
        System.out.println(name + " cat drink ...");
    }
}
