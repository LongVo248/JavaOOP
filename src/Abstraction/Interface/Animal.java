package Abstraction.Interface;

public abstract class Animal implements CanMove {
    @Override
    public void run() {
        System.out.println("Animal run...");
    }
}
