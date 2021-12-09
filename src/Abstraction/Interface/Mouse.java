package Abstraction.Interface;

public class Mouse extends Animal implements CanEat,CanDrink{
    @Override
    public void back() {
        System.out.println("Mouse back ...");
    }

    @Override
    public int getVelocity() {
        return 100;
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat ...");
    }

    @Override
    public void drink() {
        System.out.println("Mouse drink ...");
    }
}
