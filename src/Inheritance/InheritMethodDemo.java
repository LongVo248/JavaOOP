package Inheritance;

public class InheritMethodDemo {
    public static void main(String[] args) {
        Cat tom= new Cat("Tom",3,20);

        //method Animal
        System.out.println("name: " + tom.getName());
        System.out.println("animalName: " + tom.getAnimalName());

        //method Cat
        System.out.println("Age: " + tom.getAge());
        System.out.println("Height: " + tom.getHeight());

        Mouse mickey= new Mouse("Mickey",50);

        //method Animal
        System.out.println("name: "+mickey.getName());
        System.out.println("animalName: "+mickey.getAnimalName());

        //method Mouse
        System.out.println("Weight: "+mickey.getWeight());
    }
}
