package Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Meo",12,20);

        Cat asianCat= new AsianCat("Meo Asian",14,25);

        System.out.println("Animal name of cat1: "+cat.getAnimalName());

        System.out.println("Animal name of cat2: "+asianCat.getAnimalName());
    }
}
