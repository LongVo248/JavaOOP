package Polymorphism;

public abstract class Animal {
    private String name;

    //default constructor
    public Animal(){
        //default value to "name"
        this.name= this.getAnimalName();
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //abstract method
    public abstract String getAnimalName();
}