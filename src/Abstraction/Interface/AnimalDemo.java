package Abstraction.Interface;

public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println("Drink " + Cat.SEVENUP);
        CanEat canEat= new Cat("Meo");

        CanDrink canDrink= new Mouse();
        canEat.eat();
        canDrink.drink();

        boolean isCat= canEat instanceof Cat;
        System.out.println("catEat is Cat? " + isCat);

        if (canDrink instanceof Mouse){
            Mouse mouse= (Mouse) canDrink;
            mouse.drink();
        }
    }
}
