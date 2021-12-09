package Inheritance;

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal tom= new Cat("Tom",3,20);

        System.out.println("name:"+tom.getName());
        System.out.println("height:"+tom.getAnimalName());

        boolean isMouse= tom instanceof Mouse;
        System.out.println("Tom is Mouse?"+ isMouse);

        boolean isCat = tom instanceof Cat;
        System.out.println("Tom is cat? " + isCat);

        boolean isAnimal = tom instanceof Animal;
        System.out.println("Tom is animal? " + isAnimal);
    }
}
